package com.atguigu.myspringboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select password from user where username = #{username}")
    String getPassWord(String username);
}
