package com.sangtran.restaurant.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangtran.restaurant.convert.MenuConvert;
import com.sangtran.restaurant.dto.MenuDto;
import com.sangtran.restaurant.entity.DrinkEntity;
import com.sangtran.restaurant.entity.FoodEntity;
import com.sangtran.restaurant.entity.MenuEntity;
import com.sangtran.restaurant.repository.IDrinkRepository;
import com.sangtran.restaurant.repository.IFoodRepository;
import com.sangtran.restaurant.repository.IMenuRepository;

@Service
public class MenuServiceImpl implements IMenuService{
	
	@Autowired
	private IMenuRepository menuRepository;
	
	@Autowired
	private IDrinkRepository drinkRepository;
	
	@Autowired
	private IFoodRepository foodRepository;
	
	@Autowired
	private MenuConvert menuConvert;

//	@SuppressWarnings("unchecked")
//	@Override
//	public MenuDto create(MenuDto menuDto) {
//		DrinkEntity drinkEntity = drinkRepository.findOneById(menuDto.getId());
//		FoodEntity foodEntity = foodRepository.findOneById(menuDto.getId());
//		MenuEntity menuEntity = menuConvert.toEntity(menuDto);
//		menuEntity.setDrinkEntity((Set<DrinkEntity>) drinkEntity);
//		menuEntity.setFoodEntity((Set<FoodEntity>) foodEntity);
//		menuEntity = menuRepository.save(menuEntity);
//		return menuConvert.toDto(menuEntity);
//	}
	
	
}
