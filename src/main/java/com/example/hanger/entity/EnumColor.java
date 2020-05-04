package com.example.hanger.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * (EnumColor)实体类
 *
 * @author makejava
 * @since 2020-05-04 08:39:37
 */
@Data
public class EnumColor implements Serializable {
    private static final long serialVersionUID = -13826747563769847L;
    
    private Integer id;
    
    private String value;


}