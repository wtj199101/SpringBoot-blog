package cn.springBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/07/07.
 * 碎言碎语
 */
@Controller
public class ShortWordController {
    @RequestMapping("word")
    public  String main(){
        return "blog/shuo";
    }

}
