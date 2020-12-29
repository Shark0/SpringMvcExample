package com.shark.example.controller;

import com.shark.example.dao.pojo.CarDo;
import com.shark.example.service.FindCarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/car")
public class CarController {

    private final FindCarService findCarService;

    @GetMapping
    public ModelAndView all() {
        List<CarDo> carList = findCarService.request();
        ModelAndView model = new ModelAndView("all_cars");
        model.addObject("cars", carList);
        return model;
    }
}
