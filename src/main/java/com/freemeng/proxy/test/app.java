package com.freemeng.proxy.test;

import java.lang.reflect.Proxy;

public class app {
    public static void main(String[] args) {
        // 第一种 不使用代理
//        Human human = new HumanImpl();
//        human.eat("beef");
        // 第二种 使用静态代理
//        Human human = new HumanProxy();
//        human.eat("beef");
        // 第三种 使用动态代理
//        Human human = new HumanImpl();
//        DynamicProxy dynamicProxy = new DynamicProxy(human);
//        Human humanProxy = (Human) Proxy.newProxyInstance(human.getClass().getClassLoader(), human.getClass().getInterfaces(), dynamicProxy);
//        humanProxy.eat("beef");

        // 第三种 动态代理优化后的调用方法
        HumanImpl human = new HumanImpl();
        DynamicProxy dynamicProxy = new DynamicProxy(human);
        Human humanProxy = dynamicProxy.getProxy();
        humanProxy.eat("beef");

        // 第四种 CGLib 动态代理调用方法
//        CGLibProxy cgLibProxy = new CGLibProxy();
//        HumanImpl proxy = cgLibProxy.getProxy(HumanImpl.class);
//        proxy.eat("beef");
//        proxy.drink("water");
    }
}
