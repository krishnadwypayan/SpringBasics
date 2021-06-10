package com.example.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Krishna Kota on 04/06/21
 */
@Profile("local")
@Configuration
@ComponentScan("com.example.demo")
@PropertySource("classpath:application-local.properties")
public class DevConfig {
}
