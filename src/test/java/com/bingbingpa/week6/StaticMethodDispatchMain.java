package com.bingbingpa.week6;

public class StaticMethodDispatchMain {
    public static void main(String[] args) {

        StaticMethodDispatch.method1();
        StaticMethodDispatch staticMethodDispatch = new StaticMethodDispatch();
        staticMethodDispatch.method2();
        staticMethodDispatch.method2("스태틱 메소드 디스패치3");
    }
}
