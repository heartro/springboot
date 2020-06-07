package com.heartrozw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestController {
    @RequestMapping("/test")
    public ModelAndView test(ModelAndView model) {
        model.addObject("name", "张三丰");
        model.setViewName("test");
        return model;
    }
}
