package com.sangTran.Restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sangTran.Restaurant.entity.DrinkMenuEntity;

public interface IDrinkMenuRepository extends JpaRepository<DrinkMenuEntity, Long> {

}
