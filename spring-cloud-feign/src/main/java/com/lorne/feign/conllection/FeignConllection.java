package com.lorne.feign.conllection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lorne.feign.service.FeignServiceDemo;

@RestController
public class FeignConllection {

	@Autowired
	private FeignServiceDemo feignServiceDemo;
	
	@RequestMapping("/hi")
	public String seyHello(@RequestParam String name){
		return feignServiceDemo.sayHiFromClinetA(name);
	}
	
}
