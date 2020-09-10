package com.upgrad.hireWheel.daos;

import com.upgrad.hireWheel.entities.Users;
import org.springframework.stereotype.Repository;

@Repository("usersDAO")
public interface usersDAO{
    Users saveUsers(Users users);
    int findByRoleId(int roleId);
    Users findByEmail(String email);
    Users findByPassword(String password);
    Users findByEmailAndPassword(String email, String password);



}
