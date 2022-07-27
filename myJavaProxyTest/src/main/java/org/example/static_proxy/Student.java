package org.example.static_proxy;

/**
 * 委托类
 */
public class Student implements Person {
    @Override
    public void speak() {
        System.out.println("student speak...");
    }
}
