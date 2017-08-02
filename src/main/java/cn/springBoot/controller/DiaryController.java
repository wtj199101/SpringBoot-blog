package cn.springBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/07/07.
 * 个人日记
 */
@Controller
public class DiaryController {
    @RequestMapping(value = {"diary.html","diary"})
    public  String main(){
        return "blog/diary";
    }
}
