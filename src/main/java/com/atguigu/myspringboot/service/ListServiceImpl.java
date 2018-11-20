package com.atguigu.myspringboot.service;

import com.atguigu.myspringboot.bean.Employee;
import com.atguigu.myspringboot.dao.ListDao;
import com.atguigu.myspringboot.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ListServiceImpl implements ListService{
    /*@Autowired
    ListDao listDao;*/

    @Autowired
    EmployeeMapper employeeMapper;
    @Override
    public List<Employee> getMsg() {

        return employeeMapper.getMsg();
    }

    @Override
    public Employee getById(Integer id) {
        return employeeMapper.getMsgById(id);
    }

    @Override
    public void addEmployee(Employee employee) {
    employeeMapper.addEmployee(employee);
    }

    @Override
    public void deleteEmployee(Integer id) {
        employeeMapper.deleteEmployee(id);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeMapper.updateEmployee(employee);
    }
}
