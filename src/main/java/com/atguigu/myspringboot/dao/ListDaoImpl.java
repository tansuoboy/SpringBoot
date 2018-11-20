/*
package com.atguigu.myspringboot.dao;

import com.atguigu.myspringboot.bean.Employee;
import com.atguigu.myspringboot.service.ListService;
import org.springframework.beans.factory.annotation.Autowired;

public class ListDaoImpl implements ListDao {
    @Autowired
    ListService listService;
    public Employee getMsg() {
        return new Employee();
    }

    @Override
    public Employee getById(Integer id) {
        return listService.getById(id);
    }

    @Override
    public void addEmployee(Employee employee) {
        listService.addEmployee(employee);
    }

    @Override
    public void deleteEmployee(Integer id) {
        listService.deleteEmployee(id);
    }

    @Override
    public void updateEmployee(Integer id) {
        listService.updateEmployee(id);
    }
}
*/
