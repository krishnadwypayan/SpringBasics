package com.example.demo.repo;

import org.springframework.stereotype.Repository;

/**
 * Created by Krishna Kota on 04/06/21
 */
@Repository
public class MyRepositoryImpl implements MyRepository {
    public void query() {
        System.out.println("Querying..");
    }
}
