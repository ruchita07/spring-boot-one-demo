package com.springbootone.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootone.demo.models.Bike;

public interface BikeRepository extends JpaRepository<Bike, Long> {

}
