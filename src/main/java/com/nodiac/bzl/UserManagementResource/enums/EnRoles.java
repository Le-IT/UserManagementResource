package com.nodiac.bzl.UserManagementResource.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.stream.Stream;

public enum EnRoles {

    ADMIN("0"),
    GESCHAEFTSFUEHRER("1"),
    VERKAUF("2"),
    BERATUNG("3"),
    MARKETING("4"),
    REFFUEHRER("5"),
    PREISPFLEGE("6"),
    EINKAUF("7"),
    LAGER("8");

    private final String code;

    EnRoles(String code) {
        this.code = code;

    }

    @JsonCreator
    public static EnRoles decode(final String code) {
        return Stream.of(EnRoles.values()).filter(targetEnum -> targetEnum.code.equals(code)).findFirst().orElse(null);
    }

    @JsonValue
    public String getCode() {
        return code;
    }
}
