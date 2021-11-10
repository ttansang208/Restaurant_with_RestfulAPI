package com.sangtran.restaurant.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangtran.restaurant.convert.DrinkConvert;
import com.sangtran.restaurant.dto.DrinkDto;
import com.sangtran.restaurant.entity.DrinkEntity;
import com.sangtran.restaurant.repository.IDrinkRepository;

@Service
public class DrinkServiceImpl implements IDrinkService {

	@Autowired
	private IDrinkRepository drinkRepository;
	
	@Autowired
	private DrinkConvert drinkConvert;
	
	@Override
	public DrinkDto create(DrinkDto drinkDto) {
		DrinkEntity drinkEntity = new DrinkEntity();
		if(drinkDto.getId() != null){
			DrinkEntity oldDrinkEntity = drinkRepository.findOneById(drinkDto.getId());
			drinkEntity = drinkConvert.toEntity(drinkDto, oldDrinkEntity);
		}else {
			drinkEntity = drinkConvert.toEntity(drinkDto);
		}
		drinkRepository.save(drinkEntity);
		return drinkConvert.toDto(drinkEntity);
	}

	@Override
	public void delete(long[] id) {
		for(long item : id) {
			drinkRepository.deleteById(item);
		}		
	}

	@Override
	public List<DrinkDto> findALl() {
		List<DrinkDto> result = new ArrayList<>();
		List<DrinkEntity> drinkEntities = drinkRepository.findAll();
		for(DrinkEntity item : drinkEntities) {
			DrinkDto dinkDto = drinkConvert.toDto(item);
			result.add(dinkDto);
		}
		if(result.size() == 0) return null;
		return result;
	}

	@Override
	public DrinkDto findById(long id) {
		DrinkDto drinkDto = new DrinkDto();
		DrinkEntity drinkEntity = drinkRepository.findOneById(id);
		drinkDto = drinkConvert.toDto(drinkEntity);
		return drinkDto;
	}


}
