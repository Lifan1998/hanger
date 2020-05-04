package com.example.hanger.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * (EnumDressup)实体类
 *
 * @author makejava
 * @since 2020-05-04 08:39:56
 */
@Data
public class EnumDressup implements Serializable {
    private static final long serialVersionUID = 151953704150860313L;
    
    private Integer id;
    
    private String value;


}