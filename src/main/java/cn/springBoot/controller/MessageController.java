package cn.springBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/07/07.
 * 留言
 */
@Controller
public class MessageController {
    @RequestMapping(value = {"message","message.html"})
    public  String main(){
        return "blog/message";
    }

}
