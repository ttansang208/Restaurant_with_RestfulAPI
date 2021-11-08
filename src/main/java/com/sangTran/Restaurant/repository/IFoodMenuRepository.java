package com.sangTran.Restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sangTran.Restaurant.entity.FoodMenuEntity;

public interface IFoodMenuRepository extends JpaRepository<FoodMenuEntity, Long> {

}
