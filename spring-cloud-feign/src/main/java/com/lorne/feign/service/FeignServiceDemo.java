package com.lorne.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="CLIENT-A")
public interface FeignServiceDemo {

	/**
	 * 定义springcloud 调用服务接口
	 * @param name
	 * @return
	 */
	@RequestMapping(value="test",method=RequestMethod.GET)
	String sayHiFromClinetA(@RequestParam(value="name") String name);
	
}
