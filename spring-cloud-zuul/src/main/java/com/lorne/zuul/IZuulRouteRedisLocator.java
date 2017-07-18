package com.lorne.zuul;

import java.util.List;
import java.util.Map;

import org.springframework.cloud.netflix.zuul.filters.Route;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties.ZuulRoute;

import com.lorne.zuul.bean.IZuulRouteRule;

public class IZuulRouteRedisLocator extends ZuulRouteLocator {

	public IZuulRouteRedisLocator(String servletPath, ZuulProperties properties) {
		super(servletPath, properties);
	}

	@Override
	public Map<String, ZuulRoute> loadLocateRoute() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IZuulRouteRule> getRules(Route route) {
		// TODO Auto-generated method stub
		return null;
	}

}
