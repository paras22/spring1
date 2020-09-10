package com.upgrad.hireWheel.exceptions;

public class UserAlreadyExistsException  extends  RuntimeException{
    public UserAlreadyExistsException(String ex){
        super(ex);
    }
}
