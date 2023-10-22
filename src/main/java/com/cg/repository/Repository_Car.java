package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.Car;

@Repository
public interface Repository_Car extends JpaRepository<Car, Integer> {

}
