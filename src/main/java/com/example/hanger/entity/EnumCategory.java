package com.example.hanger.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * (EnumCategory)实体类
 *
 * @author makejava
 * @since 2020-05-04 08:39:10
 */
@Data
public class EnumCategory implements Serializable {
    private static final long serialVersionUID = -95752600998130678L;
    
    private Integer id;
    
    private String value;


}