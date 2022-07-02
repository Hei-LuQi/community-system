package com.example.communitysystem.service;



import com.baomidou.mybatisplus.extension.service.IService;
import com.example.communitysystem.entity.Worker;

import java.util.List;

public interface WorkerService extends IService<Worker> {

    /**
     * 增加
     * @param worker
     * @return
     */
    int insert(Worker worker);

    /**
     * 删除
     * @param id
     * @return
     */
    int deleteById(String id);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    int deleteByIds(List<String> ids);

    /**
     * 修改
     * @param worker
     * @return
     */
    int update(Worker worker);

    /**
     * 查询所有
     * @return
     */
    List<Worker> selectAll();

    /**
     * 根据名字查询
     * @param name
     * @return
     */
    List<Worker> selectByName(String name);

}
