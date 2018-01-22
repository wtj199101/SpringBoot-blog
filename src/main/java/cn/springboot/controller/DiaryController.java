package cn.springboot.controller;

import cn.springboot.common.CookieUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/07/07.
 * 个人日记
 */
@Controller
public class DiaryController {
    @RequestMapping(value = {"diary.html","diary"})
    public  String main(HttpServletRequest request, HttpServletResponse response){
        CookieUtils.setCookie(request,response,"login","123123");
        return "blog/diary";
    }
}
