package com.upgrad.hireWheel.daos;

import com.upgrad.hireWheel.entities.FUEL_TYPE;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("FuelTypeDAO")
public interface FuelTypeDAO  extends JpaRepository<FUEL_TYPE, Integer> {
}
