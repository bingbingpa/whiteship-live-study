package com.bingbingpa.week10;

public class HelloThread extends Thread {

    public static void main(String[] args) {
        (new HelloThread()).start();
    }

    public void run() {
        System.out.println("Hello from a thread!");
    }
}
