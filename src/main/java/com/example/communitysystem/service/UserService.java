package com.example.communitysystem.service;



import com.baomidou.mybatisplus.extension.service.IService;
import com.example.communitysystem.entity.User;

import java.util.List;

public interface UserService extends IService<User> {

    /**
     * 根据姓名和密码获取用户
     * @param name
     * @param password
     * @return
     */
    List<User> selectUserByNameAndPassword(String name,String password);

    /**
     * 增加
     * @param user
     * @return
     */
    int insert(User user);

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
     * @param user
     * @return
     */
    int update(User user);

    /**
     * 查询所有
     * @return
     */
    List<User> selectAll();

    /**
     * 根据名字查询
     * @param name
     * @return
     */
    List<User> selectByName(String name);

}
