package com.lorne.zuul.bean;

import java.util.List;
import java.util.Set;

public class ZuulRouteEntity {

	private String id;

	private String path;
	
	private boolean enable;

	private String url;
	
	private boolean customSensitiveHeaders;
	
	private Set<String> sensitiveHeadersSet;
	
	private String serviceId;
	
	private boolean retryable;
	
	private boolean stripPrefix;
	
	private List<IZuulRouteRule> ruleList;
	
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean isCustomSensitiveHeaders() {
		return customSensitiveHeaders;
	}

	public void setCustomSensitiveHeaders(boolean customSensitiveHeaders) {
		this.customSensitiveHeaders = customSensitiveHeaders;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Set<String> getSensitiveHeadersSet() {
		return sensitiveHeadersSet;
	}

	public void setSensitiveHeadersSet(Set<String> sensitiveHeadersSet) {
		this.sensitiveHeadersSet = sensitiveHeadersSet;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public boolean isRetryable() {
		return retryable;
	}

	public void setRetryable(boolean retryable) {
		this.retryable = retryable;
	}

	public boolean isStripPrefix() {
		return stripPrefix;
	}

	public void setStripPrefix(boolean stripPrefix) {
		this.stripPrefix = stripPrefix;
	}

	public List<IZuulRouteRule> getRuleList() {
		return ruleList;
	}

	public void setRuleList(List<IZuulRouteRule> ruleList) {
		this.ruleList = ruleList;
	}
	
}
