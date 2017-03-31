package cn.springBoot.testService;

import cn.springBoot.model.User;

public interface UserService {

    User findByName(String name);
}
