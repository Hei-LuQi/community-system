package com.example.communitysystem.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.example.communitysystem.entity.OrganizationService;
import com.example.communitysystem.mapper.OrganizationServiceMapper;
import com.example.communitysystem.service.OrganizationServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OrganizationServiceServiceImpl extends ServiceImpl<OrganizationServiceMapper, OrganizationService> implements OrganizationServiceService {

    @Autowired
    OrganizationServiceMapper organizationServiceMapper;

    @Override
    public int insert(OrganizationService organizationService) {
        return organizationServiceMapper.insert(organizationService);
    }

    @Override
    public List<OrganizationService> selectAll() {
        return organizationServiceMapper.selectList(new QueryWrapper<>());
    }

    @Override
    public List<OrganizationService> selectByLeader(String leader) {
        return organizationServiceMapper.selectList(new QueryWrapper<OrganizationService>().eq("leader",leader));
    }

    @Override
    public int update(OrganizationService organizationService) {
        return organizationServiceMapper.updateById(organizationService);
    }

    @Override
    public int deleteById(String id) {
        return organizationServiceMapper.deleteById(id);
    }

    @Override
    public int deleteByIds(List<String> ids) {
        return organizationServiceMapper.deleteBatchIds(ids);
    }
}
