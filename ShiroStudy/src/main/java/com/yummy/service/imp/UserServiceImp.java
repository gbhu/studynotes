package com.yummy.service.imp;

import com.yummy.dao.EmployeeDao;
import com.yummy.dao.UserDao;
import com.yummy.domin.T_tbp_employee;
import com.yummy.domin.User;
import com.yummy.service.EmployeeService;
import com.yummy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yummy on 2017/9/8.
 */
@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDao userDao;

    public List<User> query(Map<String, Object> param) {
        return userDao.query(param);
    }

    public User findById(Long id) {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("id", id);
        List<User> users = this.query(param);
        return users.size() > 0 ? users.get(0) : null;
    }

    public User saveUser(User user) {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("name", user.getName());
        param.put("address", user.getPassword());
        userDao.saveUser(param);
        user.setId((Long) param.get("id"));
        return user;
    }

    public void deleteUser(long id) {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("id", id);
        userDao.deleteUser(param);
    }

    public User updateUser(User user) {
        userDao.updateUser(user);
        return user;
    }
}
