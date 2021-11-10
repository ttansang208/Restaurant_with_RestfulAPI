package com.sangtran.restaurant.convert;

import org.springframework.stereotype.Component;

import com.sangtran.restaurant.dto.MenuDto;
import com.sangtran.restaurant.entity.MenuEntity;

@Component
public class MenuConvert {
	
	public MenuEntity toEntity(MenuDto dto) {
		MenuEntity menuEntity = new MenuEntity();
		menuEntity.setName(dto.getName());		
		menuEntity.setImage(dto.getImage());
		menuEntity.setPrice(dto.getPrice());
		menuEntity.setDescription(dto.getDescription());
		menuEntity.setAdditionDetail(dto.getAdditionDetail());
		return menuEntity;
	}
	public MenuDto toDto(MenuEntity entity) {
		MenuDto menuDto = new MenuDto();
		menuDto.setName(entity.getName());		
		menuDto.setImage(entity.getImage());
		menuDto.setPrice(entity.getPrice());
		menuDto.setDescription(entity.getDescription());
		menuDto.setAdditionDetail(entity.getAdditionDetail());
		return menuDto;
	}
}
