package com.example.hanger.service.impl;

import com.example.hanger.dao.OutfitDao;
import com.example.hanger.entity.Outfit;
import com.example.hanger.service.OutfitService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OutfitServiceImplTest {
    @Resource
    OutfitDao outfitDao;

    @Resource
    OutfitService outfitService;

    @Test
    void queryById() {
    }

    @Test
    void queryAllByLimit() {
    }

    @Test
    void queryAll() {
        System.out.println(outfitService.queryAll(new Outfit()));
    }

    @Test
    void insert() {
    }

    @Test
    void update() {
    }

    @Test
    void deleteById() {
    }
}