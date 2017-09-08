package com.yummy.service;

import com.yummy.domin.T_tbp_employee;
import org.apache.ibatis.annotations.Param;

/**
 * Created by yummy on 2017/9/8.
 */
public interface EmployeeService {
     T_tbp_employee findById(String id);
}
