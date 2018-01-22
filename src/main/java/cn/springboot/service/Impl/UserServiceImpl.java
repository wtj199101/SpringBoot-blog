package cn.springBoot.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.springBoot.Service.BaseService;
import cn.springBoot.Service.UserService;
import cn.springBoot.mapper.UserMapper;
import cn.springBoot.model.User;

@Service
public class UserServiceImpl extends BaseService<User> implements  UserService{
    @Autowired
    private UserMapper userMapper;
    
    @Override
    public User findByName(String name) {

        return this.userMapper.selectByName(name);
    }
    @Override
    public int insertUser(User user) {
        return this.userMapper.insertEntity(user);
    }


   

}
