package com.example.springproxy;

import org.springframework.stereotype.Repository;

/**
 * Created by Krishna Kota on 09/06/21
 */
@Repository
public class MyRepository {
    public void query() {
        System.out.println("Querying...");
    }
}
