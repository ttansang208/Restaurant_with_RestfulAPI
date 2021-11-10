package com.sangtran.restaurant.service;

import java.util.List;

import com.sangtran.restaurant.dto.DrinkDto;

public interface IDrinkService {

	DrinkDto create(DrinkDto drinkDto);

	void delete(long[] id);
	
	List<DrinkDto> findALl();

	DrinkDto findById(long id);
	
}
