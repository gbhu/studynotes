package com.yummy.core.shiro.cache;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.apache.shiro.session.Session;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.exceptions.JedisConnectionException;

import com.yummy.common.utils.LoggerUtils;
import com.yummy.common.utils.SerializeUtil;
import com.yummy.common.utils.StringUtils;

/**
 * 
 */
public class JedisManager {

    private JedisPool jedisPool;

    public Jedis getJedis() {
        Jedis jedis = null;
        try {
            jedis = getJedisPool().getResource();
        } catch (JedisConnectionException e) {
        	String message = StringUtils.trim(e.getMessage());
        	if("Could not get a resource from the pool".equalsIgnoreCase(message)){
        		System.out.println("++++++++++请检查你的redis服务++++++++");
        		System.out.println("|①.请检查是否安装redis服务，如果没安装");
        		System.out.println("|②.请检查redis 服务是否启动。启动口诀[windows  安装目录中的redis-server.exe；mac or linux 安装目录中的 src/redis-server");
        		System.out.println("|③.请检查redis启动是否带配置文件启动，也就是是否有密码，是否端口有变化（默认6379）。解决方案，参考第二点。如果需要配置密码和改变端口，请修改spring-cache.xml配置。|");

        		System.exit(0);//停止项目
        	}
        	throw new JedisConnectionException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return jedis;
    }

    public void returnResource(Jedis jedis, boolean isBroken) {
        if (jedis == null)
            return;
        /**
         * @deprecated starting from Jedis 3.0 this method will not be exposed.
         * Resource cleanup should be done using @see {@link redis.clients.jedis.Jedis#close()}
        if (isBroken){
            getJedisPool().returnBrokenResource(jedis);
        }else{
            getJedisPool().returnResource(jedis);
        }
        */
        jedis.close();
    }

    public byte[] getValueByKey(int dbIndex, byte[] key) throws Exception {
        Jedis jedis = null;
        byte[] result = null;
        boolean isBroken = false;
        try {
            jedis = getJedis();
            jedis.select(dbIndex);
            result = jedis.get(key);
        } catch (Exception e) {
            isBroken = true;
            throw e;
        } finally {
            returnResource(jedis, isBroken);
        }
        return result;
    }

    public void deleteByKey(int dbIndex, byte[] key) throws Exception {
        Jedis jedis = null;
        boolean isBroken = false;
        try {
            jedis = getJedis();
            jedis.select(dbIndex);
            Long result = jedis.del(key);
            LoggerUtils.fmtDebug(getClass(), "删除Session结果：%s" , result);
        } catch (Exception e) {
            isBroken = true;
            throw e;
        } finally {
            returnResource(jedis, isBroken);
        }
    }

    public void saveValueByKey(int dbIndex, byte[] key, byte[] value, int expireTime)
            throws Exception {
        Jedis jedis = null;
        boolean isBroken = false;
        try {
            jedis = getJedis();
            jedis.select(dbIndex);
            jedis.set(key, value);
            if (expireTime > 0)
                jedis.expire(key, expireTime);
        } catch (Exception e) {
            isBroken = true;
            throw e;
        } finally {
            returnResource(jedis, isBroken);
        }
    }

    public JedisPool getJedisPool() {
        return jedisPool;
    }

    public void setJedisPool(JedisPool jedisPool) {
        this.jedisPool = jedisPool;
    }

	/**
	 * 获取所有Session
	 * @param dbIndex
	 * @param redisShiroSession
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public Collection<Session> AllSession(int dbIndex, String redisShiroSession) throws Exception {
		Jedis jedis = null;
        boolean isBroken = false;
        Set<Session> sessions = new HashSet<Session>();
		try {
            jedis = getJedis();
            jedis.select(dbIndex);
            
            Set<byte[]> byteKeys = jedis.keys((JedisShiroSessionRepository.REDIS_SHIRO_ALL).getBytes());  
            if (byteKeys != null && byteKeys.size() > 0) {  
                for (byte[] bs : byteKeys) {  
                	Session obj = SerializeUtil.deserialize(jedis.get(bs),  
                    		 Session.class);  
                     if(obj instanceof Session){
                    	 sessions.add(obj);  
                     }
                }  
            }  
        } catch (Exception e) {
            isBroken = true;
            throw e;
        } finally {
            returnResource(jedis, isBroken);
        }
        return sessions;
	}
}