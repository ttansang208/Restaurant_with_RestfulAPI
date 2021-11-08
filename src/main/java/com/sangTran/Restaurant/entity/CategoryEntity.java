package com.sangTran.Restaurant.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "category")
public class CategoryEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private Long id;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categoryEntity")
	private Set<DrinkMenuEntity> drinkMenuEntity = new HashSet<DrinkMenuEntity>();
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categoryEntity")
	private Set<FoodMenuEntity> foodMenuEntity = new HashSet<FoodMenuEntity>();
	
	@Column(name ="name")
	private String name;
	
}
