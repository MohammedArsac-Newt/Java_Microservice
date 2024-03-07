package com.hema.edgeservice1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hema.edgeservice1.model.RigSensor;


public interface RigSensorRepo extends JpaRepository<RigSensor, Integer> {

}
