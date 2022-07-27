package org.example.static_proxy;

/***
 * 代理类
 */
public class StudentProxy implements Person {
    private Person person;

    public StudentProxy(Person person) {
        this.person = person;
    }

    @Override
    public void speak() {
        person.speak();
    }
}
