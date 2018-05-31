package com.boot.net;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class Application {

	public static void main(String[] args) throws Exception {
		//是否使用热加载
		System.setProperty("spring.devtools.restart.enabled", "true");
		
		SpringApplication.run(Application.class, args);
	}
}
