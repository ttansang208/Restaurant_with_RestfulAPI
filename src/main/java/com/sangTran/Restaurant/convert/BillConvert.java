package com.sangtran.restaurant.convert;

import com.sangtran.restaurant.dto.BillDto;
import com.sangtran.restaurant.entity.BillEntity;

public class BillConvert {
	public BillEntity toEntity(BillDto dto) {
		BillEntity billEntity = new BillEntity();
		billEntity.setQuantity(dto.getQuantity());
		billEntity.setTotalPrice(dto.getTotalPrice());
		billEntity.setOrderTime(dto.getOderTime());
		return billEntity;
	}
}
