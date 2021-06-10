package com.example.proxy;

import org.springframework.aop.framework.ProxyFactory;

/**
 * Created by Krishna Kota on 09/06/21
 */
public class ProxyMain {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory(new Person());
        Person person = (Person) proxyFactory.getProxy();
        person.greet();
    }
}
