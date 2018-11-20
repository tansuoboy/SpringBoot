package com.atguigu.myspringboot.mapper;

import com.atguigu.myspringboot.bean.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DepartmentMppper {

    @Select("select * from department where id =#{id}")
    Department getById(Integer id);
}
