package com.freemeng.proxy.study;

/**
 * proxy 类对真实类的封装对于粒度的控制有着重要的意义
 * GOF 对静态代理模式的描述：
 * 代理模式（Proxy）,为其他对象提供一种代理以控制对这个对象的访问
 */
public class SubjectProxy implements Subject {
    Subject subjectImpl = new RealSubject();

    @Override
    public void doSomething() {
        System.out.println("这里可以记录日志！");
        System.out.println("这里可以做权限控制！");
        System.out.println("开始调用被代理对象的方法！");
        subjectImpl.doSomething();
    }
}
