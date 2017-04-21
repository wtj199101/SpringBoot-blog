package cn.springBoot.Service;

import cn.springBoot.model.User;

public interface UserService {

    int insertUser(User user);

    User findByName(String name);

}
