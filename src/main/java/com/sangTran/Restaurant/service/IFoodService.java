package com.sangtran.restaurant.service;

import java.util.List;

import com.sangtran.restaurant.dto.FoodDto;

public interface IFoodService {
	public FoodDto create(FoodDto foodDto);

	void delete(long[] id);
	
	List<FoodDto> findAll();

	FoodDto findById(long id);
}
