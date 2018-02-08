package com.guonl.security.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Author: guonl
 * Description: 测试类
 * Date: 2018/2/7 11:08
 */
@RestController
@RequestMapping("/hello")
@Api
public class HelloController {

    @ApiOperation("测试类")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello(HttpServletResponse response) throws IOException {
        response.getWriter().print("hello world");
        return null;
    }
}
