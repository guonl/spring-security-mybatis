package com.guonl.security.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: guonl
 * Description: TODO
 * Date: 2018/2/6 17:32
 */
@RestController
@RequestMapping("personal")
@Api(description = "personal级别用户")
public class PersonalController {

    @ApiOperation(value = "访问")
    @RequestMapping(value = "/", method = RequestMethod.POST)
    @PreAuthorize("hasRole('PERSONAL')")
    public ResponseEntity<?> getPersonalGreeting () {
        return ResponseEntity.ok("Greeting from personal");
    }

}
