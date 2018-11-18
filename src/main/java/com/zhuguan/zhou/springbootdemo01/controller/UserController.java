package com.zhuguan.zhou.springbootdemo01.controller;

import com.zhuguan.zhou.springbootdemo01.pojo.UserDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping(value = "/user/insertUserInfo")
    public UserDto insertUserInfo (@RequestBody UserDto userDto) {
        logger.info("插入的用户信息insertUserInfo：" + userDto);
        return userDto;
    }
}
