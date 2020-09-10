package com.upgrad.hireWheel.daos;

import com.upgrad.hireWheel.entities.LOCATION;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("LocationDAO")
public interface LocationDAO  extends JpaRepository<LOCATION, Integer> {
}
