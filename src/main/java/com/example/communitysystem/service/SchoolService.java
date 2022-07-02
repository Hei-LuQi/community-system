package com.example.communitysystem.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.communitysystem.entity.School;

import java.util.List;

public interface SchoolService extends IService<School> {

    /**
     * 增加
     * @param school
     * @return
     */
    int insert(School school);

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
     * @param school
     * @return
     */
    int update(School school);

    /**
     * 查询所有
     * @return
     */
    List<School> selectAll();

    /**
     * 根据名字模糊查询
     * @param name
     * @return
     */
    List<School> selectByName(String name);

}
