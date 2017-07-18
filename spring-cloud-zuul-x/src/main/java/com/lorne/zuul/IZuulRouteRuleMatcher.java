package com.lorne.zuul;

import java.util.List;

import org.springframework.cloud.netflix.zuul.filters.Route;

import com.lorne.zuul.bean.IZuulRouteRule;

public class IZuulRouteRuleMatcher {

	/**
	 * 校验路由规则。
	 * @param route
	 * @param rules
	 * @return
	 */
	public Route matchingRule(Route route, List<IZuulRouteRule> rules) {
		// TODO Auto-generated method stub
		return null;
	}

}
