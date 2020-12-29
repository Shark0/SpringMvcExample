package com.shark.example.service;

import com.shark.example.dao.pojo.CarDo;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class FindCarService {

    public final JdbcTemplate jdbcTemplate;

    public List<CarDo> request() {
        String sql = "select * from car";
        List<CarDo> carList = jdbcTemplate.query(sql,
                new BeanPropertyRowMapper(CarDo.class));
        return carList;
    }
}
