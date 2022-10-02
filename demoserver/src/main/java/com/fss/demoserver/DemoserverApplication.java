package com.fss.demoserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableEurekaServer
@Slf4j
public class DemoserverApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(DemoserverApplication.class, args);
	       log.info("------DemoserverApplication Started-----");

	}

}
