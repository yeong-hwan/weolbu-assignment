package com.weolbu.core.enums;

public enum MemberType {
    STUDENT("수강생"),
    INSTRUCTOR("강사"),
    ADMIN("관리자");

    private final String description;

    MemberType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
