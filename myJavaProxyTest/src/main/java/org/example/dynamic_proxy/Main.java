package org.example.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/***
 * 动态代理测试
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Object obj = Proxy.newProxyInstance(Student.class.getClassLoader(), new Class[]{Person.class, Animal.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        return method.invoke(student, args);
                    }
                }
        );

        Animal animal = (Animal) obj;
        animal.sleep();

        Person person = (Person) obj;
        person.play();
    }
}
// student sleep...
// student play...
