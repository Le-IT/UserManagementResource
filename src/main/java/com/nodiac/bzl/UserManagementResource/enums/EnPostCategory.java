package com.nodiac.bzl.UserManagementResource.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.stream.Stream;

public enum EnPostCategory {

    EVP("0"),
    NEWS("1"),
    PRIVATE("2"),
    IDEAS("3"),
    INSTANTNEWS("4"),
    HAPPENING("5");


    private final String code;

    EnPostCategory(String code) {
        this.code = code;

    }

    @JsonCreator
    public static EnPostCategory decode(final String code) {
        return Stream.of(EnPostCategory.values()).filter(targetEnum -> targetEnum.code.equals(code)).findFirst().orElse(null);
    }

    @JsonValue
    public String getCode() {
        return code;
    }
}
