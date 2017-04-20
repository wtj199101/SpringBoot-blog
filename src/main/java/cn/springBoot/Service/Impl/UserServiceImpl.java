package cn.springBoot.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.springBoot.Service.BaseService;
import cn.springBoot.Service.UserService;
import cn.springBoot.mapper.UserMapper;
import cn.springBoot.model.User;

@Service
public class UserServiceImpl extends BaseService<User> implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    protected int insertModel(User model) {
        return  this.userMapper.insert(model);
    }

    @Override
    protected int updateModel(User model) {
        return   this.userMapper.updateByPrimaryKey(model);
    }
    @Override
    protected User selectModel(User model) {
        return this.userMapper.selectOne(model);
    }
    @Override
    protected List<User> selectModelList(User model) {
        return this.userMapper.select(model);
    }
    @Override
    protected int deleteModel(User model) {
        return this.userMapper.delete(model);
    }

    public User findByName(String name) {

        return this.userMapper.selectByName(name);
    }

   

}
