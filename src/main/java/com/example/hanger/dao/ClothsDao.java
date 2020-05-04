package com.example.hanger.dao;

import com.example.hanger.entity.Cloths;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Cloths)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-03 17:41:59
 */
public interface ClothsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Cloths queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Cloths> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param cloths 实例对象
     * @return 对象列表
     */
    List<Cloths> queryAll(Cloths cloths);

    /**
     * 新增数据
     *
     * @param cloths 实例对象
     * @return 影响行数
     */
    int insert(Cloths cloths);

    /**
     * 修改数据
     *
     * @param cloths 实例对象
     * @return 影响行数
     */
    int update(Cloths cloths);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}