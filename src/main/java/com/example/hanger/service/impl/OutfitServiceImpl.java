package com.example.hanger.service.impl;

import com.example.hanger.entity.Outfit;
import com.example.hanger.dao.OutfitDao;
import com.example.hanger.service.OutfitService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Outfit)表服务实现类
 *
 * @author makejava
 * @since 2020-05-03 17:42:27
 */
@Service
public class OutfitServiceImpl implements OutfitService {
    @Resource
    private OutfitDao outfitDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Outfit queryById(Integer id) {
        return this.outfitDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Outfit> queryAllByLimit(int offset, int limit) {
        return this.outfitDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param outfit 实例对象
     * @return 实例对象
     */
    @Override
    public Outfit insert(Outfit outfit) {
        this.outfitDao.insert(outfit);
        return outfit;
    }

    /**
     * 修改数据
     *
     * @param outfit 实例对象
     * @return 实例对象
     */
    @Override
    public Outfit update(Outfit outfit) {
        this.outfitDao.update(outfit);
        return this.queryById(outfit.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.outfitDao.deleteById(id) > 0;
    }
}