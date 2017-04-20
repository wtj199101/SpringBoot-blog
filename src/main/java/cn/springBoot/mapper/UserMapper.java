package cn.springBoot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.springBoot.model.User;

//@Mapper//配置mybatis 这个注解就可以了
public interface UserMapper {

    @Select("select * from s_user_t where USERNAME=#{name}")
    public User findByName2(@Param("name")String name);
}
