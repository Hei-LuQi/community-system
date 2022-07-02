package com.example.communitysystem.service;



import com.baomidou.mybatisplus.extension.service.IService;
import com.example.communitysystem.entity.Institution;

import java.util.List;

public interface InstitutionService extends IService<Institution> {

    /**
     * 查询所有社区机构
     * @return
     */
    List<Institution> selectAll();

    /**
     * 根据名字查询机构
     * @param name
     * @return
     */
    List<Institution> selectByName(String name);

    /**
     * 增加机构
     * @param institution
     */
    int insert(Institution institution);

    /**
     * 删除
     * @param id
     * @return
     */
    int deleteInstitutionById(String id);

    /**
     * 修改
     * @param institution
     * @return
     */
    int update(Institution institution);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    int deleteInstitutionByIds(List<String> ids);

}
