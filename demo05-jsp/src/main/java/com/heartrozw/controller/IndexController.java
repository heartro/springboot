package com.heartrozw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(HttpServletRequest request) {
        request.setAttribute("name", "Superman");
        System.out.println("IndexController--->index()");
        return "index";
    }
}
