package cn.springBoot.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.springBoot.model.User;

@Controller
public class IndexController {
    @RequestMapping(value="/index",method=RequestMethod.GET)
    public ModelAndView register(HttpServletRequest request,User user) {
        ModelAndView mv=new ModelAndView("blog/index");
        return mv;
    }
}
