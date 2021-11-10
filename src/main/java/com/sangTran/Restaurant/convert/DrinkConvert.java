package com.sangtran.restaurant.convert;

import org.springframework.stereotype.Component;

import com.sangtran.restaurant.dto.DrinkDto;
import com.sangtran.restaurant.entity.DrinkEntity;

@Component
public class DrinkConvert {
	public DrinkEntity toEntity(DrinkDto dto) {
		DrinkEntity drinkEntity = new DrinkEntity();
		drinkEntity.setName(dto.getName());
		return drinkEntity;
	}
	
	public DrinkDto toDto(DrinkEntity entity) {
		DrinkDto drinkDto = new DrinkDto();
		drinkDto.setName(entity.getName());
		return drinkDto;
	}
	
	public DrinkEntity toEntity(DrinkDto dto, DrinkEntity drinkEntity) {
		drinkEntity.setName(dto.getName());
		return drinkEntity;
	}
}
