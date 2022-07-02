package com.example.communitysystem.service;



import com.baomidou.mybatisplus.extension.service.IService;
import com.example.communitysystem.entity.Disabled;

import java.util.List;

public interface DisabledService extends IService<Disabled> {

    /**
     * 增加
     * @param disabled
     * @return
     */
    int insert(Disabled disabled);

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
     * @param disabled
     * @return
     */
    int update(Disabled disabled);

    /**
     * 查询所有
     * @return
     */
    List<Disabled> selectAll();

    /**
     * 根据名字查询
     * @param name
     * @return
     */
    List<Disabled> selectByName(String name);

}
