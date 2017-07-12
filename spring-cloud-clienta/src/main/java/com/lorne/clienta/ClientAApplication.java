package com.lorne.clienta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 * Eureka-Client-A
 * @author ThinkPad
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class ClientAApplication {
	
	/**
	 * clientA 启动程序
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ClientAApplication.class, args);
	}
}
