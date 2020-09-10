package com.upgrad.hireWheel.daos;

import com.upgrad.hireWheel.entities.CITY;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("CityDAO")
public interface CityDAO  extends JpaRepository<CITY, Integer> {
}
