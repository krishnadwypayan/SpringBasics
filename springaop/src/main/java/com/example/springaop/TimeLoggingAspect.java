package com.example.springaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by Krishna Kota on 09/06/21
 */
@Aspect
@Component
public class TimeLoggingAspect {

    @Before("execution(void MyService.doSomething(..))")
    public void intercept(JoinPoint joinPoint) {
        System.out.println("Intercepted");
    }
}
