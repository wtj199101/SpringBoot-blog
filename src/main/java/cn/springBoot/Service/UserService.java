package cn.springBoot.Service;

import cn.springBoot.model.User;

public interface UserService {

    User findByName(String name);
}
