package com.example.hanger.service.impl;

import com.example.hanger.entity.EnumCategory;
import com.example.hanger.dao.EnumCategoryDao;
import com.example.hanger.service.EnumCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (EnumCategory)表服务实现类
 *
 * @author makejava
 * @since 2020-05-04 08:39:10
 */
@Service
public class EnumCategoryServiceImpl implements EnumCategoryService {
    @Resource
    private EnumCategoryDao enumCategoryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public EnumCategory queryById(Integer id) {
        return this.enumCategoryDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<EnumCategory> queryAllByLimit(int offset, int limit) {
        return this.enumCategoryDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param enumCategory 实例对象
     * @return 实例对象
     */
    @Override
    public EnumCategory insert(EnumCategory enumCategory) {
        this.enumCategoryDao.insert(enumCategory);
        return enumCategory;
    }

    /**
     * 修改数据
     *
     * @param enumCategory 实例对象
     * @return 实例对象
     */
    @Override
    public EnumCategory update(EnumCategory enumCategory) {
        this.enumCategoryDao.update(enumCategory);
        return this.queryById(enumCategory.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.enumCategoryDao.deleteById(id) > 0;
    }
}