package com.gyx.syn;

public class Homework01 implements Runnable{
    public static void main(String[] args) {
    	Thread t = new Thread(new Homework01());
        t.start();
        System.out.println("main");
    }
    public void run() {
        System.out.println("thread1!");
    }
}
