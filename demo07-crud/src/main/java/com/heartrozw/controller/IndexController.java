package com.heartrozw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/signIn")
    public String signIn() {
        return "signIn";
    }

    @PostMapping("/signIn")
    public String signInDo(HttpSession session, String account, String password) {
        if (!StringUtils.isEmpty(account) && "123456".equals(password)) {
            session.setAttribute("account", account);
            return "redirect:/";
        } else {
            session.setAttribute("tip", "账号或密码不正确");
            return "redirect:/signIn";
        }
    }
}
