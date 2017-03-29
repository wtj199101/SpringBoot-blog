package cn.springBoot.testService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.springBoot.dao.UserDao;
import cn.springBoot.model.User;
@Service("userService")
public class UserService {
    @Autowired
    private UserDao userDao;

    public User findByName(String name) {
        return userDao.findByName(name);
    }
   
}
