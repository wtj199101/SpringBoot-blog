package cn.springBoot.testController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.springBoot.model.User;
import cn.springBoot.testService.UserService;

@RestController
public class UserController {
   private  UserService userService;
    @RequestMapping("/getperson")
    public String getPerson() {
        String name="zhangsan";
        User u=userService.findByName(name);
        return u.toString();
    }
    @RequestMapping("/")
    public String hello(){
     return "hello,world";   
    }

}
