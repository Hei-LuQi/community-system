package com.example.communitysystem.service;



import com.baomidou.mybatisplus.extension.service.IService;
import com.example.communitysystem.entity.Volunteer;

import java.util.List;

public interface VolunteerService extends IService<Volunteer> {

    /**
     * 增加
     * @param volunteer
     * @return
     */
    int insert(Volunteer volunteer);

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
     * @param volunteer
     * @return
     */
    int update(Volunteer volunteer);

    /**
     * 查询所有
     * @return
     */
    List<Volunteer> selectAll();

    /**
     * 根据姓名查询
     * @param name
     * @return
     */
    List<Volunteer> selectByName(String name);

}
