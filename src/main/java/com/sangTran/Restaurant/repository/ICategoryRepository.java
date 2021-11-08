package com.sangTran.Restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sangTran.Restaurant.entity.CategoryEntity;

public interface ICategoryRepository extends JpaRepository<CategoryEntity,Long>{

}
