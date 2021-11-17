package com.sangtran.restaurant.convert;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.sangtran.restaurant.dto.MenuDto;
import com.sangtran.restaurant.entity.MenuEntity;

@Component
public class MenuConvert {
	ModelMapper mapper = new ModelMapper();
	public MenuEntity toEntity(MenuDto dto) {
		MenuEntity menuEntity = mapper.map(dto, MenuEntity.class);
		return menuEntity;
	}
	public MenuDto toDto(MenuEntity entity) {
		MenuDto menuDto = mapper.map(entity, MenuDto.class);
		return menuDto;
	}
}
