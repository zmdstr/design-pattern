package com.freemeng.proxy.test;

public class HumanProxy implements Human {
    Human human = new HumanImpl();

    @Override
    public void eat(String food) {
        before();
        human.eat(food);
        after();
    }

    private void before() {
        System.out.println("cook");
    }

    private void after() {
        System.out.println("clean");
    }
}
