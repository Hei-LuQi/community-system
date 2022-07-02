package com.example.communitysystem.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.example.communitysystem.entity.Dispute;
import com.example.communitysystem.mapper.DisputeMapper;
import com.example.communitysystem.service.DisputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DisputeServiceImpl extends ServiceImpl<DisputeMapper, Dispute> implements DisputeService {

    @Autowired
    DisputeMapper disputeMapper;

    @Override
    public int insert(Dispute dispute) {
        return disputeMapper.insert(dispute);
    }

    @Override
    public List<Dispute> selectAll() {
        return disputeMapper.selectList(new QueryWrapper<>());
    }

    @Override
    public List<Dispute> selectById(String id) {
        Dispute dispute = disputeMapper.selectById(id);
        List<Dispute> list = new ArrayList<>();
        list.add(dispute);
        return list;
    }

    @Override
    public int deleteById(String id) {
        return disputeMapper.deleteById(id);
    }

    @Override
    public int deleteByIds(List<String> ids) {
        return disputeMapper.deleteBatchIds(ids);
    }

    @Override
    public int update(Dispute dispute) {
        return disputeMapper.updateById(dispute);
    }
}
