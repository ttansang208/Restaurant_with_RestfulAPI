package com.sangtran.restaurant.dto;

import java.util.Date;

public class BillDto {
	private Long menuItemId;
	private Date oderTime;
	private int quantity;
	private Double totalPrice;
	
	public BillDto() {
		super();
	}
	public BillDto(Long menuItemId, Date oderTime, int quantity, Double totalPrice) {
		super();
		this.menuItemId = menuItemId;
		this.oderTime = oderTime;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
	}
	
	
	public Long getMenuItemId() {
		return menuItemId;
	}
	public void setMenuItemId(Long menuItemId) {
		this.menuItemId = menuItemId;
	}
	public Date getOderTime() {
		return oderTime;
	}
	public void setOderTime(Date oderTime) {
		this.oderTime = oderTime;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
}
