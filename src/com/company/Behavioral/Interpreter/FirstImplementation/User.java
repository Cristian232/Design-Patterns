package com.company.Behavioral.Interpreter.FirstImplementation;

import java.util.List;

public class User {

    private List<String> permissions;
    private String username;

    public User(List<String> permissions, String username) {
        this.permissions = permissions;
        this.username = username;
    }

    public List<String> getPermissions(){
        return permissions;
    }

    public String getUsername(){
        return username;
    }

}
