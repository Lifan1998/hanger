package com.example.hanger.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * (EnumSeason)实体类
 *
 * @author makejava
 * @since 2020-05-04 08:40:32
 */
@Data
public class EnumSeason implements Serializable {
    private static final long serialVersionUID = 151058612863407697L;
    
    private Integer id;
    
    private String value;


}