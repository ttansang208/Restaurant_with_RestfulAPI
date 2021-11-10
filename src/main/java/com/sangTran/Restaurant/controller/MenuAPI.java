package com.sangtran.restaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sangtran.restaurant.dto.MenuDto;
import com.sangtran.restaurant.service.IMenuService;

@RestController
@RequestMapping("/menu")

public class MenuAPI {
	
	@Autowired
	IMenuService iMenuService;
	
//	@PostMapping(value="/create")
//	public MenuDto createNew(@RequestBody MenuDto model) {
//		return iMenuService.create(model);
//	}
}
