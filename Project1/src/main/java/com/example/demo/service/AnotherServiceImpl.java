package com.example.demo.service;

import org.springframework.stereotype.Service;

/**
 * Created by Krishna Kota on 30/05/21
 */
@Service
public class AnotherServiceImpl implements MyService {

    @Override
    public void doSomething() {
        System.out.println("Another service impl");
    }
}
