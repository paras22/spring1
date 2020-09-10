package com.upgrad.hireWheel.daos;

import com.upgrad.hireWheel.entities.VEHICLE;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("VehicleDAO")
public interface VehicleDAO  extends JpaRepository<VEHICLE, Integer> {
}
