package com.example.hanger.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * (Outfitcloths)实体类
 *
 * @author makejava
 * @since 2020-05-04 08:41:02
 */
@Data
public class Outfitcloths implements Serializable {
    private static final long serialVersionUID = -12341427252218093L;
    
    private Integer id;
    
    private Integer outfitId;
    
    private Integer clothsId;


}