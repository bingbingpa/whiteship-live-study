package com.bingbingpa.week15;

import java.util.List;

public class MethodReferenceExample {

    public static MethodReferenceExample of() {
        return new MethodReferenceExample();
    }

    // 데이터 처리 로직 정의
    public static void executeMethod(String entity) {
        if (entity != null && !"".equals(entity)) {
            System.out.println("Contents : " + entity);
            System.out.println("Length : " + entity.length());
        }
    }

    // 대문자로 변경하는 코드
    public void toUpperCase(String entity) {
        System.out.println(entity.toUpperCase());
    }

    // 실행하는 예
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c");

        // 정적 메서드 참조
        list.forEach(MethodReferenceExample::executeMethod);
        // 한정적 메서드 참조
        list.forEach(MethodReferenceExample.of()::toUpperCase);
        // 비한정적 메서드 참조
        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
