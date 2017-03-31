package cn.springBoot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.springBoot.model.User;

@Mapper//配置mybatis 这个注解就可以了
public interface UserMapper {
//    City findByState(@Param("state") String state);

    @Select("select * from aut_user_t where USER_NAME=#{name}")
    public User findByName2(@Param("name")String name);
}
