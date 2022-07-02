package com.example.communitysystem.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.example.communitysystem.entity.Help;
import com.example.communitysystem.mapper.HelpMapper;
import com.example.communitysystem.service.HelpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HelpServiceImpl extends ServiceImpl<HelpMapper, Help> implements HelpService {

    @Autowired
    HelpMapper helpMapper;

    @Override
    public int insert(Help help) {
        return helpMapper.insert(help);
    }

    @Override
    public List<Help> selectAll() {
        return helpMapper.selectList(new QueryWrapper<>());
    }

    @Override
    public List<Help> selectById(String id) {
        Help help = helpMapper.selectById(id);
        List<Help> list = new ArrayList<>();
        list.add(help);
        return list;
    }

    @Override
    public int update(Help help) {
        return helpMapper.updateById(help);
    }

    @Override
    public int deleteById(String id) {
        return helpMapper.deleteById(id);
    }

    @Override
    public int deleteByIds(List<String> ids) {
        return helpMapper.deleteBatchIds(ids);
    }
}
