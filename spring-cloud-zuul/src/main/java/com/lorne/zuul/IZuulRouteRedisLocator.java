package com.lorne.zuul;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.Route;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties.ZuulRoute;
import org.springframework.util.CollectionUtils;

import com.lorne.zuul.bean.IZuulRouteRule;
import com.lorne.zuul.bean.ZuulRouteEntity;

public class IZuulRouteRedisLocator extends ZuulRouteLocator {
	public final static Logger logger = LoggerFactory.getLogger(IZuulRouteRedisLocator.class);

//	@Autowired
//	private CuratorFrameworkClient curatorFrameworkClient;

	private List<ZuulRouteEntity> locateRouteList;

	public IZuulRouteRedisLocator(String servletPath, ZuulProperties properties) {
		super(servletPath, properties);
	}

	@Override
	public Map<String, ZuulRoute> loadLocateRoute() {
		locateRouteList = new ArrayList<ZuulRouteEntity>();
//		try {
//			locateRouteList = new ArrayList<ZuulRouteEntity>();
//			// 获取所有路由配置的id
//			List<String> keys = curatorFrameworkClient.getChildrenKeys("/");
//			// 遍历获取所有路由配置
//			for (String item : keys) {
//				String value = curatorFrameworkClient.get("/" + item);
//				if (!StringUtils.isEmpty(value)) {
//					ZuulRouteEntity route = JSON.parseObject(value, ZuulRouteEntity.class);
//					// 只需要启用的路由配置
//					if (!route.isEnable()) {
//						continue;
//					}
//					route.setRuleList(new ArrayList<IZuulRouteRule>());
//					// 获取路由配置对应的所有路由规则的ID
//					List<String> ruleKeys = curatorFrameworkClient.getChildrenKeys("/" + item);
//					// 遍历获取所有的路由规则
//					for (String ruleKey : ruleKeys) {
//						String ruleStr = curatorFrameworkClient.get("/" + item + "/" + ruleKey);
//						if (!StringUtils.isEmpty(ruleStr)) {
//							ZuulRouteEntity rule = JSON.parseObject(ruleStr, ZuulRouteEntity.class);
//							// 只保留可用的路由规则
//							if (!rule.isEnable()) {
//								continue;
//							}
//							route.getRuleList().add(rule);
//						}
//					}
//					locateRouteList.add(route);
//				}
//			}
//		} catch (Exception e) {
//			logger.error("load zuul route from zk exception", e);
//		}
//		logger.info("load zuul route from zk : " + JSON.toJSONString(locateRouteList));
		return handle(locateRouteList);
	}

	@Override
	public List<IZuulRouteRule> getRules(Route route) {
		if (CollectionUtils.isEmpty(locateRouteList)) {
			return null;
		}
		for (ZuulRouteEntity item : locateRouteList) {
			if (item.getId().equals(route.getId())) {
				return item.getRuleList();
			}
		}
		return null;
	}

}
