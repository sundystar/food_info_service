package com.nayouliang.foodinfo.manager.mapper;

import com.foodinfo.model.FoodInfo;

public interface FoodInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FoodInfo record);

    int insertSelective(FoodInfo record);

    FoodInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FoodInfo record);

    int updateByPrimaryKey(FoodInfo record);
}