package com.bingbingpa.week11;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class OperatorTest {

    @Test
    @DisplayName("enum 추상 메소드 테스트")
    void enumTestAbstract() {
        assertThat(Operator.MINUS.calculate(10, 3)).isEqualTo(7);
    }
}