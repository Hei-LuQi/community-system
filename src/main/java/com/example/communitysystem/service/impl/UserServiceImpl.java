package com.example.communitysystem.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.example.communitysystem.entity.User;
import com.example.communitysystem.mapper.UserMapper;
import com.example.communitysystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> selectUserByNameAndPassword(String name, String password) {
        return userMapper.selectList(new QueryWrapper<User>().eq("name",name).eq("password",password));
    }

    @Override
    public int insert(User user) {
        System.out.println("在impl中使用功能 插入");
        return userMapper.insert(user);
    }

    @Override
    public int deleteById(String id) {
        return userMapper.deleteById(id);
    }

    @Override
    public int deleteByIds(List<String> ids) {
        return userMapper.deleteBatchIds(ids);
    }

    @Override
    public int update(User user) {
        return userMapper.updateById(user);
    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectList(new QueryWrapper<>());
    }
    public void printl(){
        System.out.println("发生什么是啊");
    }

    @Override
    public List<User> selectByName(String name) {
        return userMapper.selectList(new QueryWrapper<User>().like("name",name));
    }
}
