package com.bingbingpa.week15;

public class ThreadExample {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World");
            }
        });
        thread.start();

        Thread thread1 = new Thread(() -> System.out.println("Hello Lambda"));
        thread1.start();
    }
}
