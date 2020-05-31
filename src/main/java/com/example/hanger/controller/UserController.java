package com.example.hanger.controller;

import com.example.hanger.domain.LoginContext;
import com.example.hanger.entity.User;
import com.example.hanger.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2020-05-04 08:41:28
 */
@RestController
@RequestMapping("/user")
public class UserController {
    /**
     * 服务对象
     */
    @Autowired
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param userId 主键
     * @return 单条数据
     */
    @GetMapping("/get")
    public User get(Integer userId) {
        return userService.get(userId);
    }

    @PostMapping("login")
    public User login(@RequestBody LoginContext loginContext) {
        if (loginContext.getLoginType() == 1) {
            // 手机号登录
            return userService.loginByMobileNo(loginContext.getMobile(), loginContext.getPassword());
        }
        return null;
    }

}