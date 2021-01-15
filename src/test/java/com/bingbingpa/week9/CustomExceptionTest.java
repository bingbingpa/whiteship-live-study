package com.bingbingpa.week9;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CustomExceptionTest {

    @Test
    @DisplayName("checked Exception")
    void checkedExceptionTest() {
        try {
            wrapCheckedException("9999999ffkeofe9");
        } catch (MyBusinessException e) {
            // handle exception
            System.out.println("error ================== " + e);
        }

    }

    @Test
    @DisplayName("unchecked Exception")
    void uncheckedExceptionTest() {
        try {
            wrapUnCheckedException("9999999ffkeofe9");
        } catch (MyUncheckedBusinessException e) {
            // handle exception
            System.out.println("error ================== " + e);
        }

    }


    private void wrapCheckedException(String input) throws MyBusinessException {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new MyBusinessException("A message that describes the error.", e, ErrorCode.INVALID_PORT_CONFIGURATION);
        }
    }

    private void wrapUnCheckedException(String input) throws MyUncheckedBusinessException {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new MyUncheckedBusinessException("A message that describes the error.", e, ErrorCode.INVALID_PORT_CONFIGURATION);
        }
    }
}