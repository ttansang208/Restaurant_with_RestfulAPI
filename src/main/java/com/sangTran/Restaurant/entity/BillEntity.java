package com.sangtran.restaurant.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="bill")

public class BillEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private Long id;
	
	@Column(name = "orderTime")
	private Date orderTime;
	
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "totalPrice")
	private double TotalPrice;
	
	@Column(name = "Menu_id")
	@OneToMany(mappedBy = "bill")	
	private Set<MenuEntity> menuEntity;
		

	public BillEntity() {
		super();
	}

	public BillEntity(Long id, Date orderTime, int quantity, double totalPrice, Set<MenuEntity> menuEntity) {
		super();
		this.id = id;
		this.orderTime = orderTime;
		this.quantity = quantity;
		TotalPrice = totalPrice;
		this.menuEntity = menuEntity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalPrice() {
		return TotalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		TotalPrice = totalPrice;
	}

	public Set<MenuEntity> getMenuEntity() {
		return menuEntity;
	}

	public void setMenuEntity(Set<MenuEntity> menuEntity) {
		this.menuEntity = menuEntity;
	}
	
	
	
}
