package com.example.hanger.service;

import com.example.hanger.entity.EnumCategory;
import java.util.List;

/**
 * (EnumCategory)表服务接口
 *
 * @author makejava
 * @since 2020-05-04 08:39:10
 */
public interface EnumCategoryService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    EnumCategory queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<EnumCategory> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param enumCategory 实例对象
     * @return 实例对象
     */
    EnumCategory insert(EnumCategory enumCategory);

    /**
     * 修改数据
     *
     * @param enumCategory 实例对象
     * @return 实例对象
     */
    EnumCategory update(EnumCategory enumCategory);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}