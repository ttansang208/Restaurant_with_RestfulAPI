package com.sangtran.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sangtran.restaurant.entity.FoodEntity;

public interface IFoodRepository extends JpaRepository<FoodEntity, Long> {

	FoodEntity findOneById(Long id);

}
