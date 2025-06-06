package com.sky.service.impl;

import com.sky.mapper.SetmealMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SetmealService implements com.sky.service.SetmealService {
    @Autowired
    private SetmealMapper setmealMapper;
}
