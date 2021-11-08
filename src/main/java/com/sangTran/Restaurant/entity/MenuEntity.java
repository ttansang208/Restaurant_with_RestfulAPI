package com.sangTran.Restaurant.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="menu")
public class MenuEntity implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private Long id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "description", nullable = false)
	private String description;
	
	@Column(name = "images")
	private ImagesEntity images;
	
	@Column(name = "price", nullable = false)
	private double price;
	
	@OneToMany(mappedBy = "category")
	private Set<CategoryEntity> category = new HashSet<CategoryEntity>();
	
	@OneToMany(mappedBy = "images")
	private Set<ImagesEntity> imagesEntity = new HashSet<ImagesEntity>();
	
	@ManyToOne
	@JoinColumn(name="bill_id")
	private BillEntity billEntity = new BillEntity();
}
