package com.sangtran.restaurant.convert;

import org.springframework.stereotype.Component;

import com.sangtran.restaurant.dto.FoodDto;
import com.sangtran.restaurant.entity.FoodEntity;

@Component
public class FoodConvert {
	public FoodEntity toEntity(FoodDto dto) {
		FoodEntity foodEntity = new FoodEntity();
		foodEntity.setName(dto.getName());
		return foodEntity;
	}
	
	public FoodDto toDto(FoodEntity entity) {
		FoodDto foodDto = new FoodDto();
		foodDto.setName(entity.getName());
		return foodDto;
	}
	
	public FoodEntity toEntity(FoodDto dto, FoodEntity foodEntity) {
		foodEntity.setName(dto.getName());
		return foodEntity;
	}
}
