package com.bingbingpa.week6;

public class DynamicMethodDispatch {

    public static void main(String[] args) {
        Parent p1 = new Child1();
        Parent p2 = new Child2();

        DispatchInterface impl = new DispatchImpl();

        p1.method();
        p2.method();
        impl.method();

    }
}
