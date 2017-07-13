package com.lorne.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Value("${server.port}")
	private String port;
	
	@RequestMapping("/test")
	public String seyHi(@RequestParam String name){
		return "你还，我是CLIENT-B-"+name+"端口是："+port;
	}
}
