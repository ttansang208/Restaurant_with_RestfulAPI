package com.sangtran.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sangtran.restaurant.entity.DrinkEntity;

public interface IDrinkRepository extends JpaRepository<DrinkEntity, Long> {

	DrinkEntity findOneById(Long id);

}
