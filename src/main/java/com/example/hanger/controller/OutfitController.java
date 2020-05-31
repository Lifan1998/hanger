package com.example.hanger.controller;

import com.example.hanger.dao.ClothsDao;
import com.example.hanger.dao.OutfitDao;
import com.example.hanger.dao.OutfitclothsDao;
import com.example.hanger.domain.OutfitVO;
import com.example.hanger.entity.Outfit;
import com.example.hanger.entity.Outfitcloths;
import com.example.hanger.service.ClothsService;
import com.example.hanger.service.OutfitService;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * (Outfit)表控制层
 *
 * @author makejava
 * @since 2020-05-27 18:42:06
 */
@RestController
@RequestMapping("/outfit")
public class OutfitController {
    /**
     * 服务对象
     */
    @Resource
    private OutfitService outfitService;

    @Resource
    private OutfitDao outfitDao;

    @Resource
    ClothsDao clothsDao;

    @Resource
    private OutfitclothsDao outfitclothsDao;

    @Resource
    private ClothsService clothsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/get")
    public Outfit get(Integer id) {
        return this.outfitService.queryById(id);
    }


    @GetMapping("/query")
    public List<OutfitVO> query(Outfit outfit) {
        System.out.println(outfit);

        List<Outfit> outfits = outfitDao.queryAll(outfit);

        return outfits.stream()
                .map(outfit_ -> {
                    OutfitVO outfitVO = new OutfitVO();
                    BeanUtils.copyProperties(outfit_, outfitVO);
                    List<Outfitcloths> outfitclothsList = outfitclothsDao.queryClothsIdsByOutfitId(outfit_.getId());
                    outfitVO.setClothsList(outfitclothsList.stream().map(outfitcloths -> clothsDao.queryById(outfitcloths.getClothsId())).collect(Collectors.toList()));
                    return outfitVO;
                }).collect(Collectors.toList());
    }

    @GetMapping("/getOutfitByTemperature")
    public OutfitVO getOutfitByTemperature(Integer userId, Integer tem) {
        List<Outfit> outfits = outfitDao.queryAll(Outfit.builder().userId(userId).temperature(tem).build());
        return outfits.stream()
                .map(outfit_ -> {
                    OutfitVO outfitVO = new OutfitVO();
                    BeanUtils.copyProperties(outfit_, outfitVO);
                    List<Outfitcloths> outfitclothsList = outfitclothsDao.queryClothsIdsByOutfitId(outfit_.getId());
                    outfitVO.setClothsList(outfitclothsList.stream().map(outfitcloths -> clothsDao.queryById(outfitcloths.getClothsId())).collect(Collectors.toList()));
                    return outfitVO;
                }).findFirst().get();
    }



}