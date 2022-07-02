package com.example.communitysystem.service;



import com.baomidou.mybatisplus.extension.service.IService;
import com.example.communitysystem.entity.Help;

import java.util.List;

public interface HelpService extends IService<Help> {

    /**
     * 增加
     * @param help
     * @return
     */
    int insert(Help help);

    /**
     * 查询所有
     * @return
     */
    List<Help> selectAll();

    /**
     * 根据编号查询
     * @param id
     * @return
     */
    List<Help> selectById(String id);

    /**
     * 修改
     * @param help
     * @return
     */
    int update(Help help);

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
