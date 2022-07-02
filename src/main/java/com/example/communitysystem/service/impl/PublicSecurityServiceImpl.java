package com.example.communitysystem.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.example.communitysystem.entity.PublicSecurity;
import com.example.communitysystem.mapper.PublicSecurityMapper;
import com.example.communitysystem.service.PublicSecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PublicSecurityServiceImpl extends ServiceImpl<PublicSecurityMapper, PublicSecurity> implements PublicSecurityService {

    @Autowired
    PublicSecurityMapper publicSecurityMapper;

    @Override
    public int insert(PublicSecurity publicSecurity) {
        return publicSecurityMapper.insert(publicSecurity);
    }

    @Override
    public List<PublicSecurity> selectAll() {
        return publicSecurityMapper.selectList(new QueryWrapper<>());
    }

    @Override
    public List<PublicSecurity> selectById(String id) {
        PublicSecurity publicSecurity = publicSecurityMapper.selectById(id);
        List<PublicSecurity> list = new ArrayList<>();
        list.add(publicSecurity);
        return list;
    }

    @Override
    public int deleteById(String id) {
        return publicSecurityMapper.deleteById(id);
    }

    @Override
    public int deleteByIds(List<String> ids) {
        return publicSecurityMapper.deleteBatchIds(ids);
    }

    @Override
    public int update(PublicSecurity publicSecurity) {
        return publicSecurityMapper.updateById(publicSecurity);
    }
}
