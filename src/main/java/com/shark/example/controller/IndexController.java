package com.shark.example.controller;

import com.shark.example.aop.TimeLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping(value = "/index")
public class IndexController {

    @TimeLog
    @GetMapping
    public HashMap read() {
        return new HashMap();
    }
}
