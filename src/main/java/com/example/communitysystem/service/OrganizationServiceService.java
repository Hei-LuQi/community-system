package com.example.communitysystem.service;



import com.baomidou.mybatisplus.extension.service.IService;
import com.example.communitysystem.entity.OrganizationService;

import java.util.List;

public interface OrganizationServiceService extends IService<OrganizationService> {

    /**
     * 增加
     * @param organizationService
     * @return
     */
    int insert(OrganizationService organizationService);

    /**
     * 查询所有
     * @return
     */
    List<OrganizationService> selectAll();

    /**
     * 根据负责人查询
     * @param leader
     * @return
     */
    List<OrganizationService> selectByLeader(String leader);

    /**
     * 修改
     * @param organizationService
     * @return
     */
    int update(OrganizationService organizationService);

    /**
     * 根据id删除
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

}
