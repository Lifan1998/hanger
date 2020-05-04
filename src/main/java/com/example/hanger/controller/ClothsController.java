package com.example.hanger.controller;

import com.example.hanger.entity.Cloths;
import com.example.hanger.service.ClothsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Cloths)表控制层
 *
 * @author makejava
 * @since 2020-05-03 17:42:01
 */
@RestController
@RequestMapping("/cloths")
public class ClothsController {
    /**
     * 服务对象
     */
    @Resource
    private ClothsService clothsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/get")
    public Cloths get(Integer id) {
        return this.clothsService.queryById(id);
    }

}