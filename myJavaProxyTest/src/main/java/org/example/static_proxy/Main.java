package org.example.static_proxy;

/***
 * 静态代理测试
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        StudentProxy proxy = new StudentProxy(student);
        proxy.speak();
    }
}
// student speak...