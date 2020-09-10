package com.upgrad.hireWheel.daos;

import com.upgrad.hireWheel.entities.ROLE;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("RoleDAO")
public interface RoleDAO  extends JpaRepository<ROLE, Integer> {


}
