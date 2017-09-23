package com.yummy.controller;

import com.alibaba.fastjson.JSON;
import com.yummy.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


/**
 * Created by yummy on 2017/9/22.
 */
@Controller
public class HelloController {

    @Autowired
    PersonService personService;

    @RequestMapping(name="/getPerson",method = RequestMethod.GET)
    @ResponseBody
    public String findById(HttpServletRequest request){
       return JSON.toJSONString(personService.findById( request.getParameter("id")));
    }

}
