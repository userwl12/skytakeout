package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.entity.Dish;
import org.springframework.stereotype.Service;


public interface DishService {

    void saveWithFlavor(DishDTO dishDTO);
}
