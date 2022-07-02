package com.example.communitysystem.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.example.communitysystem.entity.Worker;
import com.example.communitysystem.mapper.WorkerMapper;
import com.example.communitysystem.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerServiceImpl extends ServiceImpl<WorkerMapper, Worker> implements WorkerService {

    @Autowired
    WorkerMapper workerMapper;

    @Override
    public int insert(Worker worker) {
        return workerMapper.insert(worker);
    }

    @Override
    public int deleteById(String id) {
        return workerMapper.deleteById(id);
    }

    @Override
    public int deleteByIds(List<String> ids) {
        return workerMapper.deleteBatchIds(ids);
    }

    @Override
    public int update(Worker worker) {
        return workerMapper.updateById(worker);
    }

    @Override
    public List<Worker> selectAll() {
        return workerMapper.selectList(new QueryWrapper<>());
    }

    @Override
    public List<Worker> selectByName(String name) {
        return workerMapper.selectList(new QueryWrapper<Worker>().eq("name",name));
    }
}
