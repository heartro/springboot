package com.heartrozw.controller;

import com.heartrozw.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
public class TestController {
    @RequestMapping("/test")
    public String test(Model model, HttpSession session, HttpServletRequest request) {
        model.addAttribute("name", "张三丰");

        model.addAttribute("name2", "<span style='color:red;'>张无忌</span>");

        model.addAttribute("user", new User(1, "张翠山", 33));
        model.addAttribute("user2", new User(2, "殷素素", 28));


        List<User> userList = new ArrayList<>();
        userList.add(new User(3, "张三", 23));
        userList.add(new User(4, "李四", 24));
        userList.add(new User(5, "王五", 25));
        userList.add(new User(6, "赵六", 26));
        userList.add(new User(7, "田七", 27));
        model.addAttribute("userList", userList);

        Set<User> userSet = new HashSet<>();
        userSet.add( new User(8, "tom", 5) );
        userSet.add( new User(9, "jerry", 5) );
        userSet.add( new User(10, "john", 5) );
        model.addAttribute("userSet", userSet);

        Map<String, User> userMap = new HashMap<>();
        userMap.put("hero1", new User(11, "superman", 35));
        userMap.put("hero2", new User(12, "batman", 50));
        userMap.put("hero3", new User(13, "sunwukong", 3500));
        model.addAttribute("userMap", userMap);

        model.addAttribute("age", 17);
        model.addAttribute("num", new Random().nextInt(5));

        model.addAttribute("role", "requestRole");
        session.setAttribute("role", "sessionRole");
        request.getServletContext().setAttribute("role", "applicationRole");

        return "test";
    }
}
