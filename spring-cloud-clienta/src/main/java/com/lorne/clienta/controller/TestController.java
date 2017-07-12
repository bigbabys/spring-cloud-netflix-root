package com.lorne.clienta.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Value("${server.port}")
	private String port;
	/**
	 * 测试接口
	 */
	@RequestMapping("test")
	public String init(@RequestParam String name){
		return "你好："+name+",端口是:"+port;
	}
}
