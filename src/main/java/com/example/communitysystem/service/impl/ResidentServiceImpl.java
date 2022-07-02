package com.example.communitysystem.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.example.communitysystem.entity.Resident;
import com.example.communitysystem.mapper.ResidentMapper;
import com.example.communitysystem.service.ResidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Service
public class ResidentServiceImpl extends ServiceImpl<ResidentMapper, Resident> implements ResidentService {

    @Autowired
    ResidentMapper residentMapper;

    @Override
    public int insert(Resident resident) {
        return residentMapper.insert(resident);
    }

    @Override
    public List<Resident> selectAll() {
        return residentMapper.selectList(new QueryWrapper<>());
    }

    @Override
    public List<Resident> selectById(String id) {
        Resident resident = residentMapper.selectById(id);
        List<Resident> list = new ArrayList<>();
        list.add(resident);
        return list;
    }

    @Override
    public int deleteById(String id) {
        return residentMapper.deleteById(id);
    }

    @Override
    public int deleteByIds(List<String> ids) {
        return residentMapper.deleteBatchIds(ids);
    }

    @Override
    public int update(Resident resident) {
        return residentMapper.updateById(resident);
    }

}
