package com.lorne.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {

	@Autowired
	private RestTemplate restTemplate;
	
	public String getEureka(String name){
		return restTemplate.getForObject("http://CLIENT-A/test?name="+name, String.class);
	}
}
