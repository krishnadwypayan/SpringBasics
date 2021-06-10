package com.example.springproxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Krishna Kota on 09/06/21
 */
@Service
public class OrderService {

    @Autowired
    private MyRepository repository;

    @Transactional
    public void placeOrder() {
        System.out.println("Placing order");
    }

    @PostConstruct
    public void afterPropertiesSet() {
        repository.query();
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroying...");
    }
}
