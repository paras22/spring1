package com.upgrad.hireWheel.services;

import com.upgrad.hireWheel.daos.usersDAO;
import com.upgrad.hireWheel.dtos.loginFunc;
import com.upgrad.hireWheel.entities.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserServiceImpl implements UserService {
    @Autowired
    usersDAO usersDAO;

    @Override
    public Users getUser(loginFunc loginFunc) throws  Exception{
        if (usersDAO.findByEmail(loginFunc.getEmail()) == null) {
            throw  new Exception("User not Registered");
        }
        if (usersDAO.findByEmail(loginFunc.getPassword()) == null) {
            throw  new Exception("Unauthorized User");

        }

        return usersDAO.findByEmailAndPassword(loginFunc.getEmail(), loginFunc.getPassword() );
    }
}
