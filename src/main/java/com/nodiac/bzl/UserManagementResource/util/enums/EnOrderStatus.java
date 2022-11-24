package com.nodiac.bzl.UserManagementResource.util.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.stream.Stream;

public enum EnOrderStatus {

    OPEN("0"),
    PENDING("1"),
    DONE("2"),
    FAILURE("3");

    private final String code;

    EnOrderStatus(String code) {
        this.code = code;

    }

    @JsonCreator
    public static EnOrderStatus decode(final String code) {
        return Stream.of(EnOrderStatus.values()).filter(targetEnum -> targetEnum.code.equals(code)).findFirst().orElse(null);
    }

    @JsonValue
    public String getCode() {
        return code;
    }
}
