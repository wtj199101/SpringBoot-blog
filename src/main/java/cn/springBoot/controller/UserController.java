package cn.springBoot.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import cn.springBoot.Service.UserService;
import cn.springBoot.model.User;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value="/regpage",method=RequestMethod.GET)
    public ModelAndView goRegisterPage(HttpServletRequest request) {
        ModelAndView mv=new ModelAndView("index");
        return mv;
    }
    @RequestMapping(value="/register",method=RequestMethod.POST)
    public ModelAndView register(HttpServletRequest request,User user) {
        user.setCreateUserId("1111");
        user.setCreateTime(Calendar.getInstance().getTime().getTime());
        int code=userService.insertUser(user);
        ModelAndView mv=new ModelAndView("blog/index");
        System.out.println("注册成功");
        return mv;
    }
}
