package com.example.communitysystem.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.example.communitysystem.entity.House;
import com.example.communitysystem.mapper.HouseMapper;
import com.example.communitysystem.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HouseServiceImpl extends ServiceImpl<HouseMapper, House> implements HouseService {

    @Autowired
    HouseMapper houseMapper;

    @Override
    public List<House> selectAll() {
        return houseMapper.selectList(new QueryWrapper<>());
    }

    @Override
    public int insert(House house) {
        return houseMapper.insert(house);
    }

    @Override
    public int deleteById(String id) {
        return houseMapper.deleteById(id);
    }

    @Override
    public int deleteByIds(List<String> ids) {
        return houseMapper.deleteBatchIds(ids);
    }

    @Override
    public int update(House house) {
        return houseMapper.updateById(house);
    }

    @Override
    public List<House> selectByUserName(String userName) {
        return houseMapper.selectList(new QueryWrapper<House>().eq("user_name",userName));
    }
}
