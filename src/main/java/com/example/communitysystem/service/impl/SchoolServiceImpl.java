package com.example.communitysystem.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.example.communitysystem.entity.School;
import com.example.communitysystem.mapper.SchoolMapper;
import com.example.communitysystem.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolServiceImpl extends ServiceImpl<SchoolMapper, School> implements SchoolService {

    @Autowired
    SchoolMapper schoolMapper;

    @Override
    public int insert(School school) {
        return schoolMapper.insert(school);
    }

    @Override
    public int deleteById(String id) {
        return schoolMapper.deleteById(id);
    }

    @Override
    public int deleteByIds(List<String> ids) {
        return schoolMapper.deleteBatchIds(ids);
    }

    @Override
    public int update(School school) {
        return schoolMapper.updateById(school);
    }

    @Override
    public List<School> selectAll() {
        return schoolMapper.selectList(new QueryWrapper<>());
    }

    @Override
    public List<School> selectByName(String name) {
        return schoolMapper.selectList(new QueryWrapper<School>().like("name",name));
    }
}
