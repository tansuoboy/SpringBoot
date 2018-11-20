package com.atguigu.myspringboot.service;

import com.atguigu.myspringboot.bean.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ListService {

    List<Employee> getMsg();

    Employee getById(Integer id);
    //增加
    void addEmployee(Employee employee);
    //删除
    void deleteEmployee(Integer id);
    //修改
    void updateEmployee(Employee employee);
}
