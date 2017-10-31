package com.linuxea.sell.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by linuxea 11/1/17
 */

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/shit")
    public String hello() {
        return "shit";
    }

}
