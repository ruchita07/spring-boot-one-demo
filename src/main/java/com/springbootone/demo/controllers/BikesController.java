package com.springbootone.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.springbootone.demo.models.Bike;
import com.springbootone.demo.repositories.BikeRepository;

@RestController
@RequestMapping("api/v1/bikes")
public class BikesController {
	
	@Autowired
	private BikeRepository bikeRepository;
	
	
	@GetMapping
	public List<Bike> list() {
		return bikeRepository.findAll();
//		List<Bike> bikes = new ArrayList<Bike>();
//		return bikes;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Bike bike) {
		bikeRepository.save(bike);
	}
	
	@GetMapping("/{id}")
	public Bike get(@PathVariable("id") long id) {
//		return new Bike();
		return bikeRepository.getOne(id);
	}

}
