package com.bingbingpa.week9;

public enum ErrorCode {

    NUMBER_FORMAT_ERROR("숫자 에러"),
    INVALID_PORT_CONFIGURATION("포트 에러");

    private final String value;

    ErrorCode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
