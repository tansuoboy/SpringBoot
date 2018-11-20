package com.atguigu.myspringboot.contorller;

import com.atguigu.myspringboot.bean.Employee;
import com.atguigu.myspringboot.service.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ListController {
    @Autowired
    ListService listService;

    @RequestMapping("/list")
    public String getListView(Model model){
        List<Employee>  list= listService.getMsg();
        model.addAttribute("list",list);
        return"/emp/list";
    }
    //删除
    @DeleteMapping("/emp/{id}")
    public String deleteEmployee(@PathVariable("id") Integer id){
        listService.deleteEmployee(id);
        return "redirect:/list";
    }
    //编辑跳转
    @GetMapping("/emp/{id}")
    public String updateEmployee(@PathVariable("id") Integer id,Model model){
        Employee employee = listService.getById(id);
        model.addAttribute("emp",employee);
        return "/emp/add";
    }
    //编辑提交
    @PutMapping("/empd")
    public String updateEmployeeOn(Employee employee){
        listService.updateEmployee(employee);
        return "redirect:/list";
    }
    //添加跳转
    @GetMapping("/emp")
    public String addEmployee(){
        return "/emp/add";
    }
    //添加
    @PostMapping("/empd")
    public String addEmployeeOn(Employee employee) {
    listService.addEmployee(employee);
    return "redirect:/list";
    }
}
