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
@RequestMapping("employee")
public class EmployeeController {

    @RequestMapping("/")
    @PreAuthorize("hasRole('EMPLOYEE')")
    public ResponseEntity<?> getEmployeeGreeting () {
        return ResponseEntity.ok("Greeting from employee");
    }

}
