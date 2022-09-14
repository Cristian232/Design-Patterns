package com.company.Behavioral.Interpreter.FirstImplementation;

//Terminal Expression
public class Permission implements PermissionExpression {

    private String permission;

    public Permission(String permission) {
        this.permission = permission.toLowerCase();
    }

    @Override
    public boolean interpret(User user) {
        return user.getPermissions().contains(permission);
    }

    @Override
    public String toString() {
        return permission;
    }
}
