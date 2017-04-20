package cn.springBoot.mapper;

import cn.springBoot.model.User;

//配置mybatis 这个注解就可以了
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User> {

    User selectByName(String name);
    
}
