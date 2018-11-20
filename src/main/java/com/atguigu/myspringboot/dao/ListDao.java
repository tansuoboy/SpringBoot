package com.atguigu.myspringboot.dao;

import com.atguigu.myspringboot.bean.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface ListDao {

    Employee getMsg();

    Employee getById(Integer id);
    //增加
    void addEmployee(Employee employee);
    //删除
    void deleteEmployee(Integer id);
    //修改
    void updateEmployee(Integer id);
}
