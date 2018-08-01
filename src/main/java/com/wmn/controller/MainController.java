package com.wmn.controller;

import com.wmn.entity.Info;
import com.wmn.service.UserServiceImpl;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
@Scope(value="prototype")
@RequestMapping(value = "/user")
public class MainController {

    @Resource
    private UserServiceImpl userService;

    @RequestMapping(value = "/login" ,method = RequestMethod.POST)
    public String  login (Info user , Model model){
        //System.out.println(username+"---------------");
        System.out.println(user.getUser_name()+"+"+user.getPw());
        //user= userService.checkLogin(username,password);
       user = userService.checkLogin(user.getUser_name(),user.getPw());

       if(user != null){
           model.addAttribute("username",user.getUser_name());
           return "success";
       }


        return "fail";
    }


}
