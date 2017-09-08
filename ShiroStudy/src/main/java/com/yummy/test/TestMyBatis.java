package com.yummy.test;

import com.alibaba.fastjson.JSON;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import com.yummy.domin.T_tbp_employee;
import com.yummy.service.EmployeeService;

import org.apache.log4j.Logger;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by yummy on 2017/9/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:config/app-dao.xml"})
public class TestMyBatis {
    private static Logger logger = Logger.getLogger(TestMyBatis.class);
    //  private ApplicationContext ac = null;
    @Resource
    private EmployeeService userService = null;

//  @Before
//  public void before() {
//      ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//      userService = (IUserService) ac.getBean("userService");
//  }

    @Test
    public void test1() {
        T_tbp_employee  user = userService.findById("1");
        // System.out.println(user.getUserName());
        // logger.info("值："+user.getUserName());
        logger.info(JSON.toJSONString(user));
    }
}
