package com.nayouliang.foodinfo.manager.logic.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.foodinfo.model.FoodInfo;
import com.nayouliang.foodinfo.manager.logic.FoodInfoServiceLogic;
import com.nayouliang.foodinfo.manager.mapper.FoodInfoMapper;
@Component
public class FoodInfoServiceLogicImpl implements FoodInfoServiceLogic {

	@Autowired
	FoodInfoMapper foodInfoMapper;
	
	public FoodInfo foodList(Map<String, Object> param) {
		
		return foodInfoMapper.selectByPrimaryKey(1);
	}

}
