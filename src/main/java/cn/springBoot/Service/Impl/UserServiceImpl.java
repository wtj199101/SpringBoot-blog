package cn.springBoot.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.springBoot.Service.UserService;
import cn.springBoot.mapper.UserMapper;
import cn.springBoot.model.User;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public User findByName(String name) {
        return userMapper.findByName2(name);
    }



}
