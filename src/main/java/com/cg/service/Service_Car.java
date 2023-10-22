package com.cg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.Dao_Car;
import com.cg.entity.Car;
import com.cg.repository.Repository_Car;

@Service
public class Service_Car implements Dao_Car {
	
	@Autowired
	private Repository_Car rcar;
	
	List<Car> cList=new ArrayList<>();

	public String addCar(Car modelName) {
		cList.add(modelName);
		return "Model Added Successfully";
	}


	public List<Car> getAllModels() {
		
		return cList;
	}

}
