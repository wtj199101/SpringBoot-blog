package cn.springBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/07/07.
 * 相册
 */

@Controller
public class PhotoController {
    @RequestMapping(value = {"photo","photo.html"})
    public  String main(){
        return "blog/photo";
    }

}
