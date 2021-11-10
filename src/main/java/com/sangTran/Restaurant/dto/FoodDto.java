package com.sangtran.restaurant.dto;

public class FoodDto {
	private Long id;
	private String name;

	public FoodDto(Long id,String name) {
		super();
		this.id= id;
		this.name = name;
	}

	public FoodDto() {
		super();
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
	
}
