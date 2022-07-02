package com.example.communitysystem.service;



import com.baomidou.mybatisplus.extension.service.IService;
import com.example.communitysystem.entity.Resident;

import java.util.List;

public interface ResidentService extends IService<Resident> {

    /**
     * 增加居民
     * @param resident
     * @return
     */
    int insert(Resident resident);

    /**
     * 查询所有居民
     * @return
     */
    List<Resident> selectAll();

    /**
     * 根据id查询居民
     * @param id
     * @return
     */
    List<Resident> selectById(String id);

    /**
     * 根据id删除居民
     * @param id
     * @return
     */
    int deleteById(String id);

    /**
     * 根据id批量删除
     * @param ids
     * @return
     */
    int deleteByIds(List<String> ids);

    /**
     * 修改居民信息
     * @param resident
     * @return
     */
    int update(Resident resident);

}
