package cn.springBoot.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.springBoot.model.User;

@Controller
public class IndexController {
    @RequestMapping(value="/",method=RequestMethod.GET)
    public String index(HttpServletRequest request,User user) {
        return "redirect:/index";
    }
    @RequestMapping(value="/index",method=RequestMethod.GET)
    public ModelAndView register(HttpServletRequest request,User user) {
        ModelAndView mv=new ModelAndView("blog/index");
        return mv;
    }
}
