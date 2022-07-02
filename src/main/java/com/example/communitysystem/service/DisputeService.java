package com.example.communitysystem.service;



import com.baomidou.mybatisplus.extension.service.IService;
import com.example.communitysystem.entity.Dispute;

import java.util.List;

public interface DisputeService extends IService<Dispute> {

    /**
     * 增加
     * @param dispute
     * @return
     */
    int insert(Dispute dispute);

    /**
     * 查询所有
     * @return
     */
    List<Dispute> selectAll();

    /**
     * 根据id查询
     * @param id
     * @return
     */
    List<Dispute> selectById(String id);

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
     * @param dispute
     * @return
     */
    int update(Dispute dispute);

}
