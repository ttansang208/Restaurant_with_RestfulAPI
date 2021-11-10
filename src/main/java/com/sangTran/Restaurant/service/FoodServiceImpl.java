package com.sangtran.restaurant.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangtran.restaurant.convert.FoodConvert;
import com.sangtran.restaurant.dto.FoodDto;
import com.sangtran.restaurant.entity.FoodEntity;
import com.sangtran.restaurant.repository.IFoodRepository;

@Service
public class FoodServiceImpl implements IFoodService {
	
	@Autowired
	IFoodRepository foodRepository;
	
	@Autowired
	FoodConvert foodConvert;
	
	@Override
	public FoodDto create(FoodDto foodDto) {
		FoodEntity foodEntity = new FoodEntity();
		if(foodDto.getId() != null) {
			FoodEntity oldFoodEntity = foodRepository.findOneById(foodDto.getId());
			foodEntity = foodConvert.toEntity(foodDto, oldFoodEntity);
		} else {
			foodEntity = foodConvert.toEntity(foodDto);
		}
		foodRepository.save(foodEntity);
		return foodConvert.toDto(foodEntity);
	}

	@Override
	public void delete(long[] id) {
		for(long item : id) {
			foodRepository.deleteById(item);
		}
	}

	@Override
	public List<FoodDto> findAll() {
		List<FoodDto> result = new ArrayList<>();
		List<FoodEntity> foodEntities = foodRepository.findAll();
		for(FoodEntity item : foodEntities) {
			FoodDto foodDto = foodConvert.toDto(item);
			result.add(foodDto);
		}
		if(result.size() == 0) return null;
		return result;
	}

	@Override
	public FoodDto findById(long id) {
		FoodDto foodDto = new FoodDto();
		FoodEntity foodEntity = foodRepository.findOneById(id);
		foodDto = foodConvert.toDto(foodEntity);
		return foodDto;
	}

}
