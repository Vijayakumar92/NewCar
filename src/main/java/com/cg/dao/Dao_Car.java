package com.cg.dao;

import java.util.List;

import com.cg.entity.Car;

public interface Dao_Car {
	
	public String addCar(Car modelName);
	public List<Car> getAllModels();

}
