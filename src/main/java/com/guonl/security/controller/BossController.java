package com.guonl.security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: guonl
 * Description: TODO
 * Date: 2018/2/6 17:31
 */
@RestController
@RequestMapping("boss")
public class BossController {

    @RequestMapping("/hello")
    public ResponseEntity<?> hello () {
        return ResponseEntity.ok("hello");
    }

    @RequestMapping("/")
    @PreAuthorize("hasRole('BOSS')")
    public ResponseEntity<?> getBossGreeting () {
        return ResponseEntity.ok("Greeting from boss");
    }

}
