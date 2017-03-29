package cn.springBoot.testService.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.springBoot.dao.UserDao;
import cn.springBoot.model.User;
import cn.springBoot.testService.UserService;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    
    public User findByName(String name) {
        return userDao.findByName(name);
    }



}
