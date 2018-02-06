package com.guonl.security.controller;

import com.guonl.security.domain.User;
import com.guonl.security.domain.UserExample;
import com.guonl.security.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Author: guonl
 * Description: TODO
 * Date: 2018/2/6 17:32
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserMapper userMapper;


    @RequestMapping("/")
    @PreAuthorize("hasRole('PERSONAL')")
    public String getUserGreeting () {
        return "hello , this is " + this.getClass().getSimpleName();
    }

    @RequestMapping("/list")
    @PreAuthorize("hasRole('BOSS')")
    public String list () {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andIdIsNotNull();
        List<User> lists = userMapper.selectByExample(userExample);
        return lists.toString();
    }

    
}
