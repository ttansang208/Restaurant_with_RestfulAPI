package com.sangtran.restaurant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sangtran.restaurant.dto.FoodDto;
import com.sangtran.restaurant.service.IFoodService;

@RestController
@RequestMapping("/food")
public class FoodMenuAPI {

	@Autowired
	IFoodService iFoodService;
	
	@PostMapping(value = "/create")
	public FoodDto createNew(@RequestBody FoodDto model) {
		return iFoodService.create(model);
	}
	@PutMapping(value ="/update/{id}")
	public FoodDto update(@RequestBody FoodDto model, @PathVariable("id") long id) {
		model.setId(id);
		return iFoodService.create(model);
	}
	
	@DeleteMapping(value = "/delete")
	public void delete(@RequestBody long[] id) {
		iFoodService.delete(id);
	}
	
	@GetMapping
	public List<FoodDto> getAll(){		
		return iFoodService.findAll();
	}
	
	@GetMapping("/getone/{id}")
	public FoodDto getOne(@PathVariable("id") long id) {
		return iFoodService.findById(id);
	}
}
