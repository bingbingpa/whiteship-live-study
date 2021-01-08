package com.bingbingpa.week8;

public interface PrintableAnimal extends Animal, Comparable<PrintableAnimal> {

    static String getDescription() {
        return "출력기능이 있는 동물 인터페이스";
    }

    // 자신의 메소드를 기본 메소드로 구현
    default void print() {
        System.out.println("이름 : " + getName());
        System.out.println("다리개수 : " + getLegs());
    }

    // 기본 메소드 추가
    default void otherDefaultMethod() {
        System.out.println("other default method");
    }

    // Comparable 인터페이스의 메소드를 상속하여 기본 메소드 구현
    @Override
    default int compareTo(PrintableAnimal o) {
        return getLegs() - o.getLegs();
    }

    // private 메소드로 기본 메소드에서 사용할 로직 분리 1
    private void printName() {
        System.out.println("이름 : " + getName());
    }

    // private 메소드로 기본 메소드에서 사용할 로직 분리 2
    private void printLegs() {
        System.out.println("다리개수 : " + getLegs());
    }
}
