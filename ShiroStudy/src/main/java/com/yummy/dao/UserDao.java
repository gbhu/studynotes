package com.yummy.dao;

import com.yummy.domin.T_tbp_employee;
import com.yummy.domin.User;

import java.util.List;
import java.util.Map;

/**
 * @author yummy
 * @date 2017/9/9
 */

public interface UserDao {
    public List<User> query(Map<String, Object> param);

    public int saveUser(Map<String, Object> param);

    public void deleteUser(Map<String, Object> param);

    public int updateUser(User user);
}
