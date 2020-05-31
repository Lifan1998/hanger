package com.example.hanger.service;

import com.example.hanger.entity.Outfit;
import java.util.List;

/**
 * (Outfit)表服务接口
 *
 * @author makejava
 * @since 2020-05-27 18:41:59
 */
public interface OutfitService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Outfit queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Outfit> queryAllByLimit(int offset, int limit);
    
    List<Outfit> queryAll(Outfit outfit);

    /**
     * 新增数据
     *
     * @param outfit 实例对象
     * @return 实例对象
     */
    Outfit insert(Outfit outfit);

    /**
     * 修改数据
     *
     * @param outfit 实例对象
     * @return 实例对象
     */
    Outfit update(Outfit outfit);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}