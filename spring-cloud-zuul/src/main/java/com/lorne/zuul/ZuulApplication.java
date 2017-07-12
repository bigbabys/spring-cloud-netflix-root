package com.lorne.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulApplication {
	
	/**
	 * zuul 启动入口
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}
}
