package cn.springBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/07/07.
 * 学无止境
 */
@Controller
public class LearnController {
    @RequestMapping(value = {"learn","learn.html"})
    public  String main(){
        return "blog/learn";
    }

}
