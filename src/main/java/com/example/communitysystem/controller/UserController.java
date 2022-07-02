package com.example.communitysystem.controller;


import com.example.communitysystem.entity.User;
import com.example.communitysystem.service.UserService;
import com.example.communitysystem.util.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {
//系统用户表
    @Autowired
    UserService userService;

    @PostMapping("/login")
    public ResponseData login(String name, String password, HttpServletRequest request){
       List<User> userList = userService.selectUserByNameAndPassword(name,password);
       for(User i : userList){
           System.out.println(i);
       }
       if(CollectionUtils.isEmpty(userList)){
           return new ResponseData("999","用户名或密码错误");
       }else{
           HttpSession session = request.getSession();
           session.setAttribute("user",userList.get(0));
           return new ResponseData("0","登录成功");
       }
    }

    @PostMapping("/insertUser")
    public ResponseData<Integer> insertUser(User user){
        return new ResponseData("0",userService.insert(user));
    }

    @GetMapping("/getAllUser")
    public ResponseData<List<User>> getAllUser(){
        return new ResponseData("0",userService.selectAll());
    }

    @GetMapping("/getUserByName")
    public ResponseData<List<User>> getUserByName(@RequestParam String page, @RequestParam int limit, @RequestParam(required = false) String name){
        return new ResponseData("0",userService.selectByName(name));
    }

    @PostMapping("/deleteUserById")
    public ResponseData<Integer> deleteById(@RequestParam String id){
        System.out.println(id);
        //admin用户不可删除
        if("admin".equals(id)){
            return new ResponseData("999",-1);
        }
        return new ResponseData("0",userService.deleteById(id));
    }

    @PostMapping("/deleteUserByIds")
    public ResponseData<Integer> deleteByIds(@RequestParam List<String> ids){
        System.out.println(ids);
        //admin用户不可删除
        if(ids.contains("admin")){
            return new ResponseData("999",-1);
        }
        return new ResponseData("0",userService.deleteByIds(ids));
    }

    @PostMapping("/updateUser")
    public ResponseData<Integer> updateUser(User user){
        return new ResponseData("0",userService.update(user));
    }

    @PostMapping("/updateMyself")
    @ResponseBody
    public String updateMyself(User user){
        userService.update(user);
        return "success";
    }

}
