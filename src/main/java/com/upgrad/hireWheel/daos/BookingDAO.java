package com.upgrad.hireWheel.daos;

import com.upgrad.hireWheel.entities.BOOKING;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("BookingDAO")
public interface BookingDAO  extends JpaRepository<BOOKING, Integer> {
}
