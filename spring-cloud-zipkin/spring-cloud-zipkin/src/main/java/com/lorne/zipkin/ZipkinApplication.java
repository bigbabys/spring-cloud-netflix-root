package com.lorne.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

/**
 * Zipkin启动程序
 * @author lorne
 *
 */
@SpringBootApplication
@EnableZipkinServer
public class ZipkinApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(ZipkinApplication.class, args);
	}
}
