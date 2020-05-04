package com.example.hanger.service.impl;

import com.example.hanger.entity.Cloths;
import com.example.hanger.dao.ClothsDao;
import com.example.hanger.service.ClothsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Cloths)表服务实现类
 *
 * @author makejava
 * @since 2020-05-03 17:42:01
 */
@Service
public class ClothsServiceImpl implements ClothsService {
    @Resource
    private ClothsDao clothsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Cloths queryById(Integer id) {
        return this.clothsDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Cloths> queryAllByLimit(int offset, int limit) {
        return this.clothsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param cloths 实例对象
     * @return 实例对象
     */
    @Override
    public Cloths insert(Cloths cloths) {
        this.clothsDao.insert(cloths);
        return cloths;
    }

    /**
     * 修改数据
     *
     * @param cloths 实例对象
     * @return 实例对象
     */
    @Override
    public Cloths update(Cloths cloths) {
        this.clothsDao.update(cloths);
        return this.queryById(cloths.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.clothsDao.deleteById(id) > 0;
    }
}