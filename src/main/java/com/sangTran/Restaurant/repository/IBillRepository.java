package com.sangTran.Restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sangTran.Restaurant.entity.BillEntity;

public interface IBillRepository extends JpaRepository<BillEntity,Long> {

}
