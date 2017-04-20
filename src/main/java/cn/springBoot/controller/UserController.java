package cn.springBoot.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import cn.springBoot.Service.UserService;
import cn.springBoot.model.User;

@RestController("user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/")
    public String hello(){
     return "hello,world";   
    }

    @RequestMapping("/index")
    public ModelAndView getPerson2(HttpServletRequest request) {
        String name="zhangsan";
        User u=userService.findByName(name);
        ModelAndView mv=new ModelAndView("index");
        mv.addObject("user", u);
        System.out.println(u.toString());
        return mv;
    }
    @RequestMapping("/register")
    public ModelAndView register(HttpServletRequest request) {
        ModelAndView mv=new ModelAndView("index");
        System.out.println("注册成功");
        return mv;
    }
}
