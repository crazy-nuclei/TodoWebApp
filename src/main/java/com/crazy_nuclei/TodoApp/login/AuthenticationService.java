package com.crazy_nuclei.TodoApp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String name, String password) {

        return name.equals("Aayush") && password.equals("Agarwal");
    }
}
