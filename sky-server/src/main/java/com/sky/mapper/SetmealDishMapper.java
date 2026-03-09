package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SetmealDishMapper {
    /**
     * 根据菜品名查询对应的套餐
     * @param dishIds
     * @return
     */
    List<Long> gerSetmealIdsByDishIds(List<Long> dishIds);
}
