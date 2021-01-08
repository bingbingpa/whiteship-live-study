package com.bingbingpa.week8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void test() {
        Cat cat = new Cat();
        Bird bird = new Bird();

        System.out.println(cat.getName()); // 고양이
        System.out.println(cat.getLegs()); // 4

        System.out.println(bird.getName()); // 새
        System.out.println(bird.getLegs()); // 2

        // 사용하기
        Snake snake = new Snake();
        snake.print(); // PrintableAnimal 의 기본 메소드 사용

        System.out.println(PrintableAnimal.getDescription());
    }

}