package cn.springboot.mapper;

import cn.springboot.model.User;

//配置mybatis 这个注解就可以了
public interface UserMapper extends BaseMapper<User,Integer> {

    User selectByName(String name);
    
}
