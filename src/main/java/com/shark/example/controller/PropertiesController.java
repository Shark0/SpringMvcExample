package com.shark.example.controller;

import com.google.gson.Gson;
import com.shark.example.controller.pojo.ValueDO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/properties")
public class PropertiesController {

    @Value("${value}")
    private String value;

    @GetMapping("/value")
    public ValueDO findValue() {
        ValueDO valueDO = new ValueDO();
        valueDO.setValue(value);
        return valueDO;
    }

    @Value("${value.array}")
    private String[] valueArray;

    @GetMapping("/valueList")
    public List<ValueDO> findValueList() {
        Gson gson = new Gson();
        List<ValueDO> valueList = Arrays.stream(valueArray).map(value -> gson.fromJson(value, ValueDO.class)).collect(Collectors.toList());
        return valueList;
    }
}
