package com.company.Behavioral.Interpreter.FirstImplementation;

public class Report {

    private String name;
    // "Not_Admin", "Finance_User" and "Admin"
    private String permission;

    public Report(String name, String permission) {
        this.name = name;
        this.permission = permission;
    }

    public String getName() {
        return name;
    }

    public String getPermission() {
        return permission;
    }
}
