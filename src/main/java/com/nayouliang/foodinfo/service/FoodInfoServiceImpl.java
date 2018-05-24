package com.nayouliang.foodinfo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodinfo.base.APIRequest;
import com.foodinfo.base.APIResult;
import com.foodinfo.enums.APIStatusEnum;
import com.foodinfo.facade.FoodInfoFacade;
import com.foodinfo.model.FoodInfo;
import com.nayouliang.foodinfo.manager.logic.FoodInfoServiceLogic;

@Service("foodInfoFacade")
public class FoodInfoServiceImpl implements FoodInfoFacade {

	
	@Autowired
	FoodInfoServiceLogic foodInfoServiceLogic;

	public APIResult foodList(APIRequest apiRequest) {
		
		APIResult result = new APIResult();
		
		Map<String,Object> param = apiRequest.getDataMap();
		String data  = apiRequest.getData();
		FoodInfo foodList = foodInfoServiceLogic.foodList(param);
		
		result.setData(foodList);
		result.setStatus(APIStatusEnum.SUCCESS.getValue());
		
		return result;
	}

	public APIResult addFood(APIRequest apiRequest) {
		APIResult result = new APIResult();
		
		Map<String,Object> param = apiRequest.getDataMap();
		String data  = apiRequest.getData();
		int num = foodInfoServiceLogic.addFood(param,data);
		if(num<=0) {
			return new APIResult(APIStatusEnum.FAIL.getValue(),APIStatusEnum.FAIL.getLabel());
		}
		result.setStatus(APIStatusEnum.SUCCESS.getValue());
		return result;
	}
	
}
