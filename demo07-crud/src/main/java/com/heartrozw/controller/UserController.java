package com.heartrozw.controller;

import com.heartrozw.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/list")
    public String list(Model model) {
        List<User> list = new ArrayList<>();
        list.add( new User("张三", 1, new Date()) );
        list.add( new User("李四", 0, new Date()) );
        list.add( new User("王五", 1, new Date()) );
        list.add( new User("赵六", 0, new Date()) );
        list.add( new User("田七", 1, new Date()) );
        model.addAttribute("list", list);

        return "user/listUser";
    }
}
