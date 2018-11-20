package com.atguigu.myspringboot.contorller;

import com.atguigu.myspringboot.bean.Department;
import com.atguigu.myspringboot.mapper.DepartmentMppper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    //注入对象
    @Autowired
    DepartmentMppper departmentMppper;
    //ctrl+shift+/ 多行注释
    @GetMapping("/atguigu/{id}")
    public Department getById(@PathVariable("id") Integer id){

        return departmentMppper.getById(id);
    }
}
