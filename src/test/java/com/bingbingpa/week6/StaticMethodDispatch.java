package com.bingbingpa.week6;

public class StaticMethodDispatch {

    public static void method1() {
        System.out.println("스태틱 메소드 디스패치1");
    }

    public void method2() {
        System.out.println("스태틱 메소드 디스패치2");
    }

    public void method2(String value) {
        System.out.println(value);
    }
}
