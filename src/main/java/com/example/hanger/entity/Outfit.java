package com.example.hanger.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Outfit)实体类
 *
 * @author makejava
 * @since 2020-05-03 17:42:26
 */
@Data
public class Outfit implements Serializable {
    private static final long serialVersionUID = 681815905290590664L;
    
    private Integer id;
    
    private Integer userId;
    
    private Integer season;
    
    private String imageUrl;
    
    private Integer dressup;
    
    private Integer temperature;


}