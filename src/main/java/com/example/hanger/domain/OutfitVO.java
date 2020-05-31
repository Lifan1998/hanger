package com.example.hanger.domain;

import com.example.hanger.entity.Cloths;
import com.example.hanger.entity.Outfit;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fan.li
 * @date 2020-05-28
 * @description
 */
@Data
public class OutfitVO extends Outfit {
    List<Cloths> clothsList = new ArrayList<Cloths>();
}

