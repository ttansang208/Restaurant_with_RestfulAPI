package com.sangtran.restaurant.dto;

public class MenuDto {
	private Long id;
	private String name;
	private String image;
	private Double price;
	private String description;
	private String additionDetail;
	
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


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getAdditionDetail() {
		return additionDetail;
	}


	public void setAdditionDetail(String additionDetail) {
		this.additionDetail = additionDetail;
	}


	public MenuDto() {
		super();
	}


	public MenuDto(Long id, String name, String image, Double price, String description, String additionDetail) {
		super();
		this.id = id;
		this.name = name;
		this.image = image;
		this.price = price;
		this.description = description;
		this.additionDetail = additionDetail;
	}
	
}
