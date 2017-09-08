package com.yummy.dao;

import com.yummy.domin.T_tbp_employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by yummy on 2017/9/8.
 */
public interface EmployeeDao {
    //注解的两个参数会自动封装成map集合，括号内即为键
    public T_tbp_employee findById(String id);
}
