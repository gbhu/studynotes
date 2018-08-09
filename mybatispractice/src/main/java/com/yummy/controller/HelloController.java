package com.yummy.controller;

import com.alibaba.fastjson.JSON;
import com.yummy.model.Student;
import com.yummy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


/**
 * 接口测试
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value="/student/{id}",method = RequestMethod.GET)
    @ResponseBody
    public String getStudentInfo(@PathVariable("id") String id){
        List<Student> students=studentService.getStudentInfo(id);
        return JSON.toJSONString(students);
    }
    @RequestMapping(value="/findById/{id}",method = RequestMethod.GET)
    @ResponseBody
    public String findById(@PathVariable("id") String id){
        Student student=studentService.findById(id);
        return JSON.toJSONString(student);
    }
}
