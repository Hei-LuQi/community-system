package com.example.communitysystem.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.example.communitysystem.entity.Disabled;
import com.example.communitysystem.mapper.DisabledMapper;
import com.example.communitysystem.service.DisabledService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisabledServiceImpl extends ServiceImpl<DisabledMapper, Disabled> implements DisabledService {

    @Autowired
    DisabledMapper disabledMapper;

    @Override
    public int insert(Disabled disabled) {
        return disabledMapper.insert(disabled);
    }

    @Override
    public int deleteById(String id) {
        return disabledMapper.deleteById(id);
    }

    @Override
    public int deleteByIds(List<String> ids) {
        return disabledMapper.deleteBatchIds(ids);
    }

    @Override
    public int update(Disabled disabled) {
        return disabledMapper.updateById(disabled);
    }

    @Override
    public List<Disabled> selectAll() {
        return disabledMapper.selectList(new QueryWrapper<>());
    }

    @Override
    public List<Disabled> selectByName(String name) {
        return disabledMapper.selectList(new QueryWrapper<Disabled>().eq("name",name));
    }
}
