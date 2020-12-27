package com.bingbingpa.week3;

import com.bingbingpa.week2.Point;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OperatorsTest {

    @Test
    @DisplayName("산술 연산 테스트")
    void arithmeticOperators() {
        int num1 = 10;
        String str1 = "hello";
        System.out.println(num1 + str1);

        System.out.println(7 / 3); // 2
        System.out.println(7 / 3.0); // 2.3333333333333335

        System.out.println(10 % 4); // 2
        System.out.println(-10 % 4); // -2 (첫번째 피연산자의 부호와 결과의 부호가 동일)
        System.out.println(10 % -4); // 2
        System.out.println(10.313f % 4); // 2.3129997

    }

    @Test
    @DisplayName("비트 연산 테스트")
    void bitwiseOperators() {
        int i = ~1;
        byte b = ~1;

        System.out.println(i);
        System.out.println(b);
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(b & 0xff));

        int num1 = 11;
        int num2 = 15;

        int result1 = num1 & num2; // 11
        System.out.println(Integer.toBinaryString(11));
        System.out.println(Integer.toBinaryString(15));
        System.out.println(result1);

        int n = 150;
        byte b1 = (byte) n;

        System.out.println(Integer.toBinaryString(150));
        System.out.println(b1);
        System.out.println(b1 & 0xff);

        int num = 10; // 00001010
        int result = num << 1; // 00010100 (20)
        int result2 = num << 2; // 00101000 (40)

        System.out.println(result);
        System.out.println(result2);

    }

    @Test
    @DisplayName("instanceof 테스트")
    void instanceofTest() {
        System.out.println("hello" instanceof String);
        Point point = new Point(10, 20);
        if (point instanceof Point) {
            System.out.println(point instanceof Point);
        }

    }

    @Test
    @DisplayName("화살표 연산자 테스트")
    void lambdaTest() {
        Runnable r = () -> {
            System.out.println("1");
            System.out.println("2");
        };

        r.run();

        // 코드가 한 문장이면 중괄호 생략 가능
        Runnable t = () -> System.out.println("1");
        t.run();
    }

    @Test
    @DisplayName("삼항 연산자 테스트")
    void conditionalOperator() {
        int i = 10;
        boolean result = i > 5 ? true : false;
        System.out.println(result);
    }

    @Test
    @DisplayName("java13 switch 테스트")
    void switchTest() {
        int result;
        String mode = "a";

        switch (mode) {
            case "a":
                result = 1;
                break;
            case "b":
                result = 4;
                break;
            case "c":
                result = 4;
                break;
            default:
                result = -1;
        }

        System.out.println(result);
    }
}
