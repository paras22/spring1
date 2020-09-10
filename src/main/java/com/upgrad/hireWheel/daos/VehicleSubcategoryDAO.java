package com.upgrad.hireWheel.daos;

import com.upgrad.hireWheel.entities.VEHICLE_SUBCATEGORY;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("VehicleSubcategoryDAO")
public interface VehicleSubcategoryDAO extends JpaRepository<VEHICLE_SUBCATEGORY, Integer> {
}
