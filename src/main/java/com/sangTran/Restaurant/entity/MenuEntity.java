package com.sangtran.restaurant.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="menu")
public class MenuEntity implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private Long id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "image")
	private String image;
	
	@Column(name = "price", nullable = false)
	private double price;
	
	@Column(name = "additionDetail")
	private String additionDetail ;
	
	@OneToMany(mappedBy = "menu")
	private Set<FoodEntity> foodEntity;
	
	@OneToMany(mappedBy = "menu")
	private Set<DrinkEntity> drinkEntity;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bill_id", referencedColumnName="id",nullable=false,unique=true)
	private BillEntity bill;

	public MenuEntity() {
		super();
	}

	public MenuEntity(Long id, String name, String description, String image, double price, String additionDetail,
			Set<FoodEntity> foodEntity, Set<DrinkEntity> drinkEntity, BillEntity bill) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.image = image;
		this.price = price;
		this.additionDetail = additionDetail;
		this.foodEntity = foodEntity;
		this.drinkEntity = drinkEntity;
		this.bill = bill;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String images) {
		this.image = images;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAdditionDetail() {
		return additionDetail;
	}

	public void setAdditionDetail(String additionDetail) {
		this.additionDetail = additionDetail;
	}

	public Set<FoodEntity> getFoodEntity() {
		return foodEntity;
	}

	public void setFoodEntity(Set<FoodEntity> foodEntity) {
		this.foodEntity = foodEntity;
	}

	public Set<DrinkEntity> getDrinkEntity() {
		return drinkEntity;
	}

	public void setDrinkEntity(Set<DrinkEntity> drinkEntity) {
		this.drinkEntity = drinkEntity;
	}

	public BillEntity getBill() {
		return bill;
	}

	public void setBill(BillEntity bill) {
		this.bill = bill;
	}
	
	
}

