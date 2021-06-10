package com.example.springaop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Krishna Kota on 09/06/21
 */
@Configuration
@ComponentScan("com.example.springaop")
@EnableAspectJAutoProxy
public class Config {
}
