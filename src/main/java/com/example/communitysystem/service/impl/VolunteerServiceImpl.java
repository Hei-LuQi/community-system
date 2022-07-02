package com.example.communitysystem.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.example.communitysystem.entity.Volunteer;
import com.example.communitysystem.mapper.VolunteerMapper;
import com.example.communitysystem.service.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VolunteerServiceImpl extends ServiceImpl<VolunteerMapper, Volunteer> implements VolunteerService {

    @Autowired
    VolunteerMapper volunteerMapper;

    @Override
    public int insert(Volunteer volunteer) {
        return volunteerMapper.insert(volunteer);
    }

    @Override
    public int deleteById(String id) {
        return volunteerMapper.deleteById(id);
    }

    @Override
    public int deleteByIds(List<String> ids) {
        return volunteerMapper.deleteBatchIds(ids);
    }

    @Override
    public int update(Volunteer volunteer) {
        return volunteerMapper.updateById(volunteer);
    }

    @Override
    public List<Volunteer> selectAll() {
        return volunteerMapper.selectList(new QueryWrapper<>());
    }

    @Override
    public List<Volunteer> selectByName(String name) {
        return volunteerMapper.selectList(new QueryWrapper<Volunteer>().eq("name",name));
    }
}
