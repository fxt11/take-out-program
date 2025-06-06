package com.sky.service.impl;

import com.sky.mapper.DishMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DishService implements com.sky.service.DishService {
    @Autowired
    DishMapper dishMapper;


}
