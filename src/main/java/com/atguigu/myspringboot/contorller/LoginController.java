package com.atguigu.myspringboot.contorller;


import com.atguigu.myspringboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    //注入对象
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/")
    public String login(){

        return "index";
    }

    //提交登录
    @PostMapping(value = "/login")
    public String loginOn(@RequestParam("username") String username, @RequestParam("password") String password, Model model, HttpServletRequest request  ){
        String realPassword = userMapper.getPassWord(username);
        if(!StringUtils.isEmpty(username)&&!StringUtils.isEmpty(password)&&password.equals(realPassword)){
            HttpSession session = request.getSession();
            session.setAttribute("loginUser","666");
            return "redirect:/main.html";
        }else{
            model.addAttribute("emp","用户名或密码错误");
            return "index";


        }

    }
}
