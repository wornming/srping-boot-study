package com.wornming.controller;

import com.wornming.util.ApplicationProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wornming
 * @version 1.0
 * @since 2019/5/30 20:07
 */
@RestController
public class HelloWorldController {
    @Autowired
    private ApplicationProperties applicationProperties;

    @RequestMapping("/hello")
    public String index() {
        System.out.println(applicationProperties.getTitle());
        System.out.println(applicationProperties.getDescription());
        return "Hello World!";
    }
}
