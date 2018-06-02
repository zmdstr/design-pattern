package com.freemeng.proxy.test;

public class HumanImpl implements Human {
    public void eat(String food) {
        System.out.println("eat " + food);
    }

    public void drink(String food) {
        System.out.println("drink " + food);
    }
}
