package com.shark.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value = "/")
public class IndexController {

    @Value("${person.name}")
    private String name;

    @GetMapping
    public ModelAndView index() {
        ModelAndView model = new ModelAndView("index");
        model.addObject("name", name);
        return model;
    }
}
