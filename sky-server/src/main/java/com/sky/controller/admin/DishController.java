package com.sky.controller.admin;

import com.sky.dto.DishDTO;
import com.sky.entity.Dish;
import com.sky.result.Result;
import com.sky.service.DishService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/admin/dish")
@RestController
@Api("菜品相关接口")
@Slf4j
public class DishController {

    @Autowired
    private DishService dishService;

    public Result save(DishDTO dishDTO) {

        dishService.saveWithFlavor(dishDTO);
        return Result.success();
    }
}
