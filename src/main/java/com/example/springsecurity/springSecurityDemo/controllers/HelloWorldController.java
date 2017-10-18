package com.example.springsecurity.springSecurityDemo.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController {

    @RequestMapping("/helloWorld")
//    @PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
    public String helloWorld(){
        return "helloWorld";
    }
}
