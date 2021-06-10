package com.example.demo.service;

import com.example.demo.repo.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * Created by Krishna Kota on 30/05/21
 */
@Service
public class MyServiceImpl implements MyService, EnvironmentAware {

    @Value("${my.name}")
    private String name;

    @Value("${service.baseUrl}")
    private String baseUrl;

    private MyRepository myRepository;
    private Environment environment;

    @Autowired
    public MyServiceImpl(@Qualifier("anotherRepositoryImpl") MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    @Override
    public void doSomething() {
        System.out.println("hello " + name);
        System.out.println(Arrays.toString(this.environment.getActiveProfiles()));
        System.out.printf("Connecting to url [%s]%n", baseUrl);
        myRepository.query();
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
