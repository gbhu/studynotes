package com.yummy.controller;

import com.sun.tools.internal.ws.processor.model.Model;
import com.yummy.model.Person;
import com.yummy.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by yummy on 2017/9/22.
 */
@Controller
public class HelloController {

    @Autowired
    PersonService personService;

    @RequestMapping("/getPerson")
    public Person findById(HttpServletRequest request){
       return personService.findById( request.getParameter("id"));
    }

}
