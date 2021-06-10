package com.example.demo;

import com.example.demo.config.DevConfig;
import com.example.demo.config.ProdConfig;
import com.example.demo.service.MyService;
import com.example.demo.service.MyServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoApplication {

	public static void main(String[] args) {

		System.setProperty("spring.profiles.active", "prod");

//		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		ApplicationContext context = new AnnotationConfigApplicationContext("com.example.demo");
		ApplicationContext context = new AnnotationConfigApplicationContext(DevConfig.class, ProdConfig.class);

		MyService bean = context.getBean(MyServiceImpl.class);
		bean.doSomething();
//		context.close();
	}

}
