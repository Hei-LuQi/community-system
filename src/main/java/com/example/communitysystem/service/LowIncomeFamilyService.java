package com.example.communitysystem.service;



import com.baomidou.mybatisplus.extension.service.IService;
import com.example.communitysystem.entity.LowIncomeFamily;

import java.util.List;

public interface LowIncomeFamilyService extends IService<LowIncomeFamily> {

    /**
     * 增加
     * @param lowIncomeFamily
     * @return
     */
    int insert(LowIncomeFamily lowIncomeFamily);

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
     * @param lowIncomeFamily
     * @return
     */
    int update(LowIncomeFamily lowIncomeFamily);

    /**
     * 查询所有
     * @return
     */
    List<LowIncomeFamily> selectAll();

    /**
     * 根据名字查询
     * @param name
     * @return
     */
    List<LowIncomeFamily> selectByName(String name);

}
