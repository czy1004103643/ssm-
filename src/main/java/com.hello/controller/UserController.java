package com.hello.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hello.model.User;
import com.hello.service.IUserService;
import com.hello.utils.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * project #project
 * authod #authod
 * datetime #datatime
 * desc  #desc
 */

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;
    protected Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping("/showUser")
    public ModelAndView selectUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ModelAndView mv = new ModelAndView();
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        long userId = Long.parseLong(request.getParameter("id"));
        User user = this.userService.selectUser(userId);
        mv.addObject("message", user.toString());
        mv.setViewName("user_select");
        return mv;
    }

    @RequestMapping("/insertUser")
    public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ModelAndView mv = new ModelAndView();
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        User user = new User();
        user.setPassword("123456789");
        boolean isSuccess = false;
        try{
            this.userService.insertUser(user);
            isSuccess = true;
        }catch (Exception e){
            isSuccess = false;
            e.printStackTrace();
            logger.info(e.getMessage());
        }
        mv.addObject("isSuccess", isSuccess);
        mv.setViewName("user_insert");
        return mv;
    }

    @RequestMapping("/updateUser")
    public ModelAndView updateUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ModelAndView mv = new ModelAndView();
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        User user = new User();
        user.setId(1);
        user.setUsername("czy");
        boolean isSuccess = false;
        try{
            this.userService.updateUser(user);
            isSuccess = true;
        }catch (Exception e){
            isSuccess = false;
            e.printStackTrace();
            logger.info(e.getMessage());
        }
        mv.addObject("isSuccess", isSuccess);
        mv.setViewName("user_update");
        return mv;
    }

    @RequestMapping("/deleteUser")
    public ModelAndView deleteUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ModelAndView mv = new ModelAndView();
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        User user = new User();
        user.setId(2);
        boolean isSuccess = false;
        try{
            this.userService.deleteUser(user);
            isSuccess = true;
        }catch (Exception e){
            isSuccess = false;
            e.printStackTrace();
            logger.info(e.getMessage());
        }
        mv.addObject("isSuccess", isSuccess);
        mv.setViewName("user_update");
        return mv;
    }
}
