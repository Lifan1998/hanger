package com.example.hanger.dao;

import com.example.hanger.entity.EnumDressup;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (EnumDressup)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-04 08:39:56
 */
public interface EnumDressupDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    EnumDressup queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<EnumDressup> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param enumDressup 实例对象
     * @return 对象列表
     */
    List<EnumDressup> queryAll(EnumDressup enumDressup);

    /**
     * 新增数据
     *
     * @param enumDressup 实例对象
     * @return 影响行数
     */
    int insert(EnumDressup enumDressup);

    /**
     * 修改数据
     *
     * @param enumDressup 实例对象
     * @return 影响行数
     */
    int update(EnumDressup enumDressup);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}