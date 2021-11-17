package com.sangtran.restaurant.convert;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.sangtran.restaurant.dto.FoodDto;
import com.sangtran.restaurant.entity.FoodEntity;

@Component
public class FoodConvert {
	ModelMapper mapper = new ModelMapper();
	public FoodEntity toEntity(FoodDto dto) {
		FoodEntity foodEntity = mapper.map(dto, FoodEntity.class);
		return foodEntity;
	}
	
	public FoodDto toDto(FoodEntity entity) {
		FoodDto foodDto = mapper.map(entity, FoodDto.class);
		return foodDto;
	}
}
