package com.example.hanger.controller;

import com.example.hanger.dao.ClothsDao;
import com.example.hanger.dao.OutfitclothsDao;
import com.example.hanger.entity.Cloths;
import com.example.hanger.entity.Outfitcloths;
import com.example.hanger.service.ClothsService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

    @Resource
    private ClothsDao clothsDao;

    @Resource
    private OutfitclothsDao outfitclothsDao;



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

    @GetMapping("/query")
    public List<Cloths> query(Cloths cloths) {
        return clothsDao.queryAll(cloths);
    }

    @GetMapping("/getMostUsedClothsList")
    public List<Cloths> getMostUsedClothsList(Integer userId) {
        List<Outfitcloths> outfitclothsList = outfitclothsDao.queryUsedClothsCount(userId);
        outfitclothsList = outfitclothsList.stream().sorted(Comparator.comparing(outfitcloths -> outfitcloths.getOutfitId())).collect(Collectors.toList());
        return outfitclothsList.stream()
                .limit(10)
                .map(outfitcloths -> clothsService.queryById(outfitcloths.getClothsId()))
                .collect(Collectors.toList());
    }

    @GetMapping("/getLessUsedClothsList")
    public List<Cloths> getLessUsedClothsList(Integer userId) {
        List<Outfitcloths> outfitclothsList = outfitclothsDao.queryUsedClothsCount(userId);
        outfitclothsList = outfitclothsList.stream().sorted(new Comparator<Outfitcloths>() {
            @Override
            public int compare(Outfitcloths o1, Outfitcloths o2) {
                return o2.getOutfitId().compareTo(o1.getOutfitId());
            }
        }).collect(Collectors.toList());
        return outfitclothsList.stream()
                .limit(10)
                .map(outfitcloths -> clothsService.queryById(outfitcloths.getClothsId()))
                .collect(Collectors.toList());
    }

}