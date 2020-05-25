package com.example.hanger.domain;

import lombok.Data;

/**
 * @author fan.li
 * @date 2020-05-25
 * @description
 */
@Data
public class LoginContext {
    String password;
    String mobile;
    int loginType;
}

