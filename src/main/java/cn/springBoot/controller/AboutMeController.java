package cn.springBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/07/07.
 */
@Controller
public class AboutMeController {
    @RequestMapping(value = {"about","about.html"})
    public String main (){
        return "blog/about";
    }
}
