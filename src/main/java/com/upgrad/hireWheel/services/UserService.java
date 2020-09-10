package com.upgrad.hireWheel.services;

import com.upgrad.hireWheel.dtos.loginFunc;
import com.upgrad.hireWheel.entities.Users;

public interface UserService {
    Users getUser(loginFunc loginFunc) throws Exception;

}
