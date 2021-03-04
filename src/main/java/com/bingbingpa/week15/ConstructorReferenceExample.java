package com.bingbingpa.week15;

import java.util.List;

public class ConstructorReferenceExample {
    private String name;

    public ConstructorReferenceExample(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name ======= " + name;
    }

    public static void main(String[] args) {
        List<String> list = List.of("Macbook", "Samsung", "Dell", "LG");

        // 람다 표현식
        list.stream().map((String name) -> new ConstructorReferenceExample(name))
                .forEach((ConstructorReferenceExample data) -> System.out.println(data));

        // 생성자 참조로 변환
        list.stream().map(ConstructorReferenceExample::new)
                .forEach((ConstructorReferenceExample data) -> System.out.println(data));

        // 생성자 참조, 메서드 참조로 변환
        list.stream().map(ConstructorReferenceExample::new)
                .forEach(System.out::println);
    }
}
