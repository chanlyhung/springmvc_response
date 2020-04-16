package com.chuang.controller;

import com.chuang.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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

    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("testVoid execute");

        // 请求转发
//        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);

        // 重定向（新的请求路径）
//        response.sendRedirect(request.getContextPath()+"/index.jsp");

        // 设置中文乱码问题
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");


       // 直接相应
        response.getWriter().println("你好!!!");

        return;
    }


    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){

        ModelAndView modelAndView = new ModelAndView();
        System.out.println("testModelAndView execute");

        User user = new User();
        user.setName("井上");
        user.setPassword("123456");
        user.setAge(23);

        modelAndView.addObject("user", user);

        modelAndView.setViewName("success");

        return modelAndView;
    }
}
