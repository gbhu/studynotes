package com.yummy.service.imp;

import com.yummy.dao.EmployeeDao;
import com.yummy.domin.T_tbp_employee;
import com.yummy.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yummy on 2017/9/8.
 */
@Service("EmployeeService")
public class EmployeeServiceImp implements EmployeeService {

    @Resource
    private  EmployeeDao employeeDao;

    public T_tbp_employee findById(String id) {
       return employeeDao.findById(id);
    }
}
