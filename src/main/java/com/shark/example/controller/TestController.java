package com.shark.example.controller;

import com.shark.example.controller.pojo.TestDO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Value("${value}")
    private String value;

    @GetMapping
    public TestDO get() {
        TestDO testDO = new TestDO();
        testDO.setValue(value);
        return testDO;
    }
}
