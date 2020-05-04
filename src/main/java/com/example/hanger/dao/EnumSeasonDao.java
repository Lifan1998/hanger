package com.example.hanger.dao;

import com.example.hanger.entity.EnumSeason;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (EnumSeason)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-04 08:40:32
 */
public interface EnumSeasonDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    EnumSeason queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<EnumSeason> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param enumSeason 实例对象
     * @return 对象列表
     */
    List<EnumSeason> queryAll(EnumSeason enumSeason);

    /**
     * 新增数据
     *
     * @param enumSeason 实例对象
     * @return 影响行数
     */
    int insert(EnumSeason enumSeason);

    /**
     * 修改数据
     *
     * @param enumSeason 实例对象
     * @return 影响行数
     */
    int update(EnumSeason enumSeason);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}