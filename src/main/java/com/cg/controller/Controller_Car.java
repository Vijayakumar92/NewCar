package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Car;
import com.cg.service.Service_Car;

@RestController
@RequestMapping("/carapi")
public class Controller_Car {
	@Autowired
	private Service_Car sCar;
	
	@PostMapping("/add")
	public String addModel(@RequestBody Car modelName) {
		
		return sCar.addCar(modelName);
	}
	
	public List<Car> getAllModels(){
		return sCar.getAllModels();
		
	}

}
