package cn.springBoot.testService.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.springBoot.mapper.UserMapper;
import cn.springBoot.model.User;
import cn.springBoot.testService.UserService;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public User findByName(String name) {
        return userMapper.findByName2(name);
    }



}
