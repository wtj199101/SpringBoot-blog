package cn.springboot.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.springboot.service.BaseService;
import cn.springboot.service.UserService;
import cn.springboot.mapper.UserMapper;
import cn.springboot.model.User;

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
