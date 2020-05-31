package com.example.hanger.dao;

import com.example.hanger.entity.Outfitcloths;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Outfitcloths)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-04 08:41:02
 */
public interface OutfitclothsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Outfitcloths queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Outfitcloths> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    List<Outfitcloths> queryUsedClothsCount(Integer userId);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param outfitcloths 实例对象
     * @return 对象列表
     */
    List<Outfitcloths> queryAll(Outfitcloths outfitcloths);

    /**
     * 新增数据
     *
     * @param outfitcloths 实例对象
     * @return 影响行数
     */
    int insert(Outfitcloths outfitcloths);

    /**
     * 修改数据
     *
     * @param outfitcloths 实例对象
     * @return 影响行数
     */
    int update(Outfitcloths outfitcloths);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);


    List<Outfitcloths> queryClothsIdsByOutfitId(Integer outfitId);
}