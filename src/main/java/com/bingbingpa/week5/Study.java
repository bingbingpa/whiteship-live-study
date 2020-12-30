package com.bingbingpa.week5;

class Study {               // 클래스
    static String classVar; // 클래스 변수

    static {                // 클래스 초기화 블록
        System.out.println("클래스 초기화 블록");
        classVar = "Class Variable";
    }

    String constructor;
    String instanceVar;     // 인스턴스 변수

    {                       // 인스턴스 초기화 블록
        instanceVar = "Instance Variable";
        System.out.println("인스턴스 초기화 블록");
    }

    Study() {                // 생성자
        constructor = "Constructor";
        System.out.println("생성자 블록");
    }

    static void classMethod() {   // 클래스 메서드
        System.out.println(classVar);
    }

    void instanceMethod() {       // 인스턴스 메서드
        System.out.println(instanceVar);
    }
}
