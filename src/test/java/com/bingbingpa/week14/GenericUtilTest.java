package com.bingbingpa.week14;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class GenericUtilTest {

    @Test
    void test() {
        Map<String, String> prop = new HashMap<String, String>();
        // 스태틱 제네릭 메소드 호출 예제
        Map<String, String> sortedProp = GenericUtil.<String, String>sorting(prop);
    }
}