package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(DemoApplication.class, args);
		System.out.println("hello world!!!!!!!!");
		Alien a=context.getBean(Alien.class);
		a.show();
//		Alien a1=context.getBean(Alien.class);
//		a1.show();
	}

}
