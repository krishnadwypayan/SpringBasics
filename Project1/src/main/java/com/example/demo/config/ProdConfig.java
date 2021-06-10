package com.example.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Krishna Kota on 04/06/21
 */
@Profile("prod")
@Configuration
@ComponentScan("com.example.demo")
@PropertySource("classpath:application-prod.properties")
public class ProdConfig {
}
