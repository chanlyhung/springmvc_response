package com.chuang.controller;

import com.chuang.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chuang
 * @date 2020/04/16 - 6:24
 */
@Controller
@RequestMapping(path = "/res")
public class ResponseController {


    @RequestMapping("/testResponse")
    public String testResponse(Model model){

        System.out.println("testResponse execute");

        User user = new User();
        user.setName("井上");
        user.setPassword("123456");
        user.setAge(23);

        model.addAttribute("user", user);

        return "success";
    }

}
