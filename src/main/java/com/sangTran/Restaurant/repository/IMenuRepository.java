package com.sangTran.Restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sangTran.Restaurant.entity.MenuEntity;

public interface IMenuRepository extends JpaRepository<MenuEntity, Long> {

}
