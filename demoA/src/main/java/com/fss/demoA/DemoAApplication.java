package com.fss.demoA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class DemoAApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAApplication.class, args);
	}

}
