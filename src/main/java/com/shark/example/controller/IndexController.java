package com.shark.example.controller;

import com.shark.example.aop.TimeLog;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Locale;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/index")
public class IndexController {

    private final MessageSource messageSource;

    @TimeLog
    @GetMapping
    public HashMap read() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("message", messageSource.getMessage("hello.world", null, Locale.TAIWAN));
        return hashMap;
    }
}
