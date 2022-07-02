package com.example.communitysystem.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.example.communitysystem.entity.LowIncomeFamily;
import com.example.communitysystem.mapper.LowIncomeFamilyMapper;
import com.example.communitysystem.service.LowIncomeFamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LowIncomeFamilyServiceImpl extends ServiceImpl<LowIncomeFamilyMapper, LowIncomeFamily> implements LowIncomeFamilyService {

    @Autowired
    LowIncomeFamilyMapper lowIncomeFamilyMapper;

    @Override
    public int insert(LowIncomeFamily lowIncomeFamily) {
        return lowIncomeFamilyMapper.insert(lowIncomeFamily);
    }

    @Override
    public int deleteById(String id) {
        return lowIncomeFamilyMapper.deleteById(id);
    }

    @Override
    public int deleteByIds(List<String> ids) {
        return lowIncomeFamilyMapper.deleteBatchIds(ids);
    }

    @Override
    public int update(LowIncomeFamily lowIncomeFamily) {
        return lowIncomeFamilyMapper.updateById(lowIncomeFamily);
    }

    @Override
    public List<LowIncomeFamily> selectAll() {
        return lowIncomeFamilyMapper.selectList(new QueryWrapper<>());
    }

    @Override
    public List<LowIncomeFamily> selectByName(String name) {
        return lowIncomeFamilyMapper.selectList(new QueryWrapper<LowIncomeFamily>().eq("name",name));
    }
}
