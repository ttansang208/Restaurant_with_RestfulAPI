package com.sangTran.Restaurant.entity;

import java.util.Date;
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
@Table(name ="bill")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class BillEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private Long id;
	
	@Column(name = "orderTime")
	private Date orderTime;
	
	@Column(name = "totalPrice")
	private int quantity;
	
	@OneToMany(mappedBy = "menu", fetch = FetchType.LAZY)
	private Set<MenuEntity> menuEntity = new HashSet<MenuEntity>();
}
