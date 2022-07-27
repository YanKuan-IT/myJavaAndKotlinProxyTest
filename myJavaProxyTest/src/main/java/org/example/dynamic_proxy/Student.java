package org.example.dynamic_proxy;

/**
 * 委托类
 */
public class Student implements Person, Animal {
    @Override
    public void play() {
        System.out.println("student play...");
    }

    @Override
    public void sleep() {
        System.out.println("student sleep...");
    }
}
