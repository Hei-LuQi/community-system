package com.example.communitysystem.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.example.communitysystem.entity.Institution;
import com.example.communitysystem.mapper.InstitutionMapper;
import com.example.communitysystem.service.InstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstitutionServiceImpl extends ServiceImpl<InstitutionMapper, Institution> implements InstitutionService {

    @Autowired
    InstitutionMapper institutionMapper;

    @Override
    public List<Institution> selectAll() {
        return institutionMapper.selectList(new QueryWrapper<>());
    }

    @Override
    public List<Institution> selectByName(String name) {
        return institutionMapper.selectList(new QueryWrapper<Institution>().eq("name",name));
    }

    @Override
    public int insert(Institution institution) {
        return institutionMapper.insert(institution);
    }

    @Override
    public int deleteInstitutionById(String id) {
        return institutionMapper.deleteById(id);
    }

    @Override
    public int update(Institution institution) {
        return institutionMapper.updateById(institution);
    }

    @Override
    public int deleteInstitutionByIds(List<String> ids) {
        return institutionMapper.deleteBatchIds(ids);
    }
}
