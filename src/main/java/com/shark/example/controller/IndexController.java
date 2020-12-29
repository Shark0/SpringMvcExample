package com.shark.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value = "/")
public class IndexController {

    @GetMapping
    public ModelAndView index() {
        ModelAndView model = new ModelAndView("index");
        return model;
    }

}
