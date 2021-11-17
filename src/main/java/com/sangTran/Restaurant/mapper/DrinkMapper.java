package com.sangtran.restaurant.convert;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.sangtran.restaurant.dto.DrinkDto;
import com.sangtran.restaurant.entity.DrinkEntity;

@Component
public class DrinkConvert {
	ModelMapper mapper = new ModelMapper();
	public DrinkEntity toEntity(DrinkDto dto) {
		DrinkEntity drinkEntity = mapper.map(dto, DrinkEntity.class);
		return drinkEntity;
	}
	
	public DrinkDto toDto(DrinkEntity entity) {
		DrinkDto drinkDto = mapper.map(entity, DrinkDto.class);
		return drinkDto;
	}
}
