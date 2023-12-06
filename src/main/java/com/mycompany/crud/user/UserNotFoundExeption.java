package com.mycompany.crud.user;

public class UserNotFoundExeption  extends Throwable {

    public UserNotFoundExeption(String message) {
        super(message);

    }
}