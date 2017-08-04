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
    public ModelAndView index(HttpServletRequest request,User user) {
        ModelAndView mv=new ModelAndView("blog/index");
        return mv;
    }
    @RequestMapping(value={"/index","index.html"},method=RequestMethod.GET)
    public String register(HttpServletRequest request,User user) {
        return "redirect:/";

    }
    @RequestMapping("/error1")
    public String error1(){
            int a=1/0;
        return "error";
    }
}
