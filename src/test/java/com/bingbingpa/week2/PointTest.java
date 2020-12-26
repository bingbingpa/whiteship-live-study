package com.bingbingpa.week2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PointTest {

    @Test
    @DisplayName("레퍼런스 타입 비교 테스트")
    public void referenceType() {
        Point point1 = new Point(10, 20);
        Point point2 = point1;
        Point point3 = new Point(10, 20);
        int num1 = 10;
        int num2 = num1;
        int num3 = 10;

        System.out.println(point1 == point2);
        System.out.println(point1 == point3);
        System.out.println(point1.equals(point3));

        point1.setX(30);
        System.out.println("point1.x =========== " + point1.getX());
        System.out.println("point2.x =========== " + point2.getX());

        System.out.println(num1 == num2);
        System.out.println(num1 == num3);

        num1 = 30;

        System.out.println("num1================ " + num1);
        System.out.println("num2================ " + num2);

        // 3*3 2차원 배열 선언
        int[][] score = {{1, 2, 3}, {1, 2, 2}, {3, 5, 7}};

        System.out.println(score[0][0]);
        System.out.println(score[2][2]);
    }
}