package com.lorne.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * Eureka 启动类
 * @author ThinkPad
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaserverApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaserverApplication.class, args);
		
	}
}
