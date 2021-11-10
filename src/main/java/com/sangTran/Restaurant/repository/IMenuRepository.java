package com.sangtran.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sangtran.restaurant.entity.MenuEntity;

public interface IMenuRepository extends JpaRepository<MenuEntity, Long> {

}
