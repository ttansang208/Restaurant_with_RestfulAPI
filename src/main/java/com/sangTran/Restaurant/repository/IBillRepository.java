package com.sangtran.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sangtran.restaurant.entity.BillEntity;

public interface IBillRepository extends JpaRepository<BillEntity,Long> {

}
