package com.bingbingpa.week8;

public class Puppy implements PrintableAnimal  {

    // Animal 인터페이스 메소드 구현
    @Override
    public String getName() {
        return "강아지";
    }

    // Animal 인터페이스 메소드 구현
    @Override
    public int getLegs() {
        return 4;
    }

    // PrintableAnimal 인터페이스 메소드 구현
    @Override
    public void print() {
        System.out.println("이름 : " + getName());
        System.out.println("다리개수 : " + getLegs());
    }

    // Comparable 인터페이스 메소드 구현
    @Override
    public int compareTo(PrintableAnimal o) {
        return getLegs() - o.getLegs();
    }

}
