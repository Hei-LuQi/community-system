package com.example.communitysystem.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.communitysystem.entity.PublicSecurity;


import java.util.List;

public interface PublicSecurityService extends IService<PublicSecurity> {

    /**
     * 增加
     * @param publicSecurity
     * @return
     */
    int insert(PublicSecurity publicSecurity);

    /**
     * 查询所有
     * @return
     */
    List<PublicSecurity> selectAll();

    /**
     * 根据id查询
     * @param id
     * @return
     */
    List<PublicSecurity> selectById(String id);

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

    /**
     * 修改
     * @param publicSecurity
     * @return
     */
    int update(PublicSecurity publicSecurity);

}
