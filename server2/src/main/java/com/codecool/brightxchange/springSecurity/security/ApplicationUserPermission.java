package com.codecool.brightxchange.springSecurity.security;

public enum ApplicationUserPermission {
    CUSTOMER_READ("customer:read"),
    STUDENT_WRITE("student:write"),
    COURSE_READ("course:read"),
    COURSE_WRITE("course:write");

    private final String permission;

    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
