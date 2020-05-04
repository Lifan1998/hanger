package com.example.hanger.service;

import com.example.hanger.entity.Cloths;
import java.util.List;

/**
 * (Cloths)表服务接口
 *
 * @author makejava
 * @since 2020-05-03 17:42:00
 */
public interface ClothsService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Cloths queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Cloths> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param cloths 实例对象
     * @return 实例对象
     */
    Cloths insert(Cloths cloths);

    /**
     * 修改数据
     *
     * @param cloths 实例对象
     * @return 实例对象
     */
    Cloths update(Cloths cloths);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}