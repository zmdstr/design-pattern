package com.freemeng.proxy.study;

public class RealSubject implements Subject {
    @Override
    public void doSomething() {
        System.out.println("call doSomething();");
    }
}
