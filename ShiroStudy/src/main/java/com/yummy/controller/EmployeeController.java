package com.yummy.controller;

import com.yummy.domin.T_tbp_employee;
import com.yummy.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by yummy on 2017/9/8.
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @RequestMapping(value="/getEmployeeById", method = RequestMethod.GET)
    public T_tbp_employee getEmployeeById(@RequestParam String id){
      return   employeeService.findById(id);
    }
}
