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

import com.sangtran.restaurant.dto.DrinkDto;
import com.sangtran.restaurant.service.IDrinkService;

@RestController
@RequestMapping("/drink")
public class DrinkMenuAPI {

	@Autowired
	private IDrinkService iDrinkService;
	
	@PostMapping(value = "/create")
	public DrinkDto createNew(@RequestBody DrinkDto model) {
		return iDrinkService.create(model);
	}
	
	@PutMapping(value ="/update/{id}")
	public DrinkDto update(@RequestBody DrinkDto model, @PathVariable("id") long id) {
		model.setId(id);
		return iDrinkService.create(model);
	}
	
	@DeleteMapping(value = "/delete")
	public void delete(@RequestBody long[] id) {
		iDrinkService.delete(id);
	}
	
	@GetMapping
	public List<DrinkDto> getAll(){		
		return iDrinkService.findALl();
	}
	
	@GetMapping("/getone/{id}")
	public DrinkDto getOne(@PathVariable("id") long id) {
		return iDrinkService.findById(id);
	}
}
