package com.yummy.service;

import com.yummy.domin.T_tbp_employee;
import com.yummy.domin.User;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;
import java.util.Map;

/**
 * Created by yummy on 2017/9/8.
 */
public interface UserService {
     public List<User> query(Map<String, Object> param);

     @Cacheable(value = "userCache", key = "#id")
     public User findById(Long id);

     @CachePut(value = "userCache", key="#result.id")
     public User saveUser(User user);

     //注意key的类型要一致，不要一个是long，一个object or string
     @CacheEvict(value = "userCache", key = "#id")
     public void deleteUser(long id);

     public User updateUser(User user);
}
