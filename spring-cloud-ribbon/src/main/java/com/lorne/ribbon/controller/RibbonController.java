package com.lorne.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lorne.ribbon.service.RibbonService;

@RestController
public class RibbonController {

	@Autowired
	private RibbonService ribbonService;
	
	@RequestMapping("/hi")
	public String seyHi(@RequestParam String name){
		return ribbonService.getEureka(name);
	}
	
	
}
