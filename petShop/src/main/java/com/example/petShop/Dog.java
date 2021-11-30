package com.example.petShop;

public class Dog extends Pet implements Runnable {

    @Override
    public void run() {
        System.out.println("Dog run!!!");
    }

    @Override
    public void speak() {
        System.out.println("멍멍");
    }
}
