package com.bingbingpa.week5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudyTest {

    @Test
    @DisplayName("초기화 순서 테스트")
    void initializerTest() {
        Study study = new Study();
    }
}