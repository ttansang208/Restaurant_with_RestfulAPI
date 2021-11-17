package com.sangtran.restaurant.convert;

import org.modelmapper.ModelMapper;

import com.sangtran.restaurant.dto.BillDto;
import com.sangtran.restaurant.entity.BillEntity;

public class BillConvert {

	ModelMapper mapper = new ModelMapper();

	public BillEntity toEntity(BillDto dto) {
		BillEntity billEntity = mapper.map(dto, BillEntity.class);
		return billEntity;
	}

	public  BillDto toDto(BillEntity entity){
		BillDto billDto = mapper.map(entity, BillDto.class);
		return billDto;
	}
	
}
