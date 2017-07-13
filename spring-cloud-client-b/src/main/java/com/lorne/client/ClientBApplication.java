package com.lorne.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 
 * @author lorne
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class ClientBApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(ClientBApplication.class, args);
	}
}
