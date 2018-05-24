package com.nayouliang.foodinfo.manager.logic;

import java.util.List;
import java.util.Map;

import com.foodinfo.model.FoodInfo;

public interface FoodInfoServiceLogic {

	/**
	 * 粮食列表展示
	 * @param param
	 * @return
	 */
	FoodInfo foodList(Map<String, Object> param);

}
