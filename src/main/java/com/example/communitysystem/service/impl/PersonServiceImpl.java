package com.example.communitysystem.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.example.communitysystem.entity.Person;
import com.example.communitysystem.mapper.PersonMapper;
import com.example.communitysystem.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements PersonService {

    @Autowired
    PersonMapper personMapper;

    @Override
    public int insert(Person person) {
        return personMapper.insert(person);
    }

    @Override
    public int deleteById(String id) {
        return personMapper.deleteById(id);
    }

    @Override
    public int deleteByIds(List<String> ids) {
        return personMapper.deleteBatchIds(ids);
    }

    @Override
    public int update(Person person) {
        return personMapper.updateById(person);
    }

    @Override
    public List<Person> selectAll() {
        return personMapper.selectList(new QueryWrapper<>());
    }

    @Override
    public List<Person> selectByNameAndType(String name,String type) {
        if(StringUtils.isEmpty(name)){
            return personMapper.selectList(new QueryWrapper<Person>().eq("type",type));
        }
        else if(StringUtils.isEmpty(type)){
            return personMapper.selectList(new QueryWrapper<Person>().eq("name",name));
        }
        else{
            return personMapper.selectList(new QueryWrapper<Person>().eq("name",name).eq("type",type));
        }

    }
}
