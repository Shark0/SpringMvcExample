package com.shark.example.service;

import com.google.gson.Gson;
import com.shark.example.dao.mapper.CarMapper;
import com.shark.example.dao.pojo.CarDo;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class FindCarService {

    public final CarMapper carMapper;

    public List<CarDo> request() {
        List<CarDo> carList = carMapper.findAll();
        System.out.println("carList: " + new Gson().toJson(carList));
        return carList;
    }

}
