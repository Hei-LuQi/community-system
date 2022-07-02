package com.example.communitysystem.service;



import com.baomidou.mybatisplus.extension.service.IService;
import com.example.communitysystem.entity.Person;

import java.util.List;

public interface PersonService extends IService<Person> {

    /**
     * 增加常住人口
     * @param person
     * @return
     */
    int insert(Person person);

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
     * @param person
     * @return
     */
    int update(Person person);

    /**
     * 查询所有
     * @return
     */
    List<Person> selectAll();

    /**
     * 根据姓名查找
     * @param name
     * @param type
     * @return
     */
    List<Person> selectByNameAndType(String name,String type);

}
