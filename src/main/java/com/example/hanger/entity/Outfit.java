package com.example.hanger.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (Outfit)实体类
 *
 * @author makejava
 * @since 2020-05-28 00:28:15
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Outfit implements Serializable {
    private static final long serialVersionUID = 245128289811089334L;
    
    private Integer id;
    
    private Integer userId;
    
    private Integer season;
    
    private String imageUrl;
    
    private Integer dressup;
    
    private Integer temperature;

}