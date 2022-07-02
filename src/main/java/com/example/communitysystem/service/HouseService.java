package com.example.communitysystem.service;



import com.baomidou.mybatisplus.extension.service.IService;
import com.example.communitysystem.entity.House;

import java.util.List;

public interface HouseService extends IService<House> {

    /**
     * 查询所有出租屋
     * @return
     */
    List<House> selectAll();

    /**
     * 增加出租屋
     * @param house
     * @return
     */
    int insert(House house);

    /**
     * 根据id删除出租屋
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
     * 更新出租屋
     * @param house
     * @return
     */
    int update(House house);

    /**
     * 根据业主名查询出租屋
     * @param userName
     * @return
     */
    List<House> selectByUserName(String userName);

}
