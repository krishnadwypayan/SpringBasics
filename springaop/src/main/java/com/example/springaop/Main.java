package com.example.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Krishna Kota on 09/06/21
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        MyService myService = context.getBean(MyService.class);
        myService.doSomething();
    }
}
