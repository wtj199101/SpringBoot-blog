package cn.springboot.service;

import cn.springboot.model.User;

public interface UserService {

    int insertUser(User user);

    User findByName(String name);

}
