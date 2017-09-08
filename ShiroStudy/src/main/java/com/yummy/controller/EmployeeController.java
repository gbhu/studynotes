package com.yummy.controller;

import com.yummy.domin.T_tbp_employee;
import com.yummy.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yummy on 2017/9/8.
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("/getEmployeeById")
    public T_tbp_employee getEmployeeById(@PathVariable String id){
      return   employeeService.findById(id);
    }
}
