/**
 * Project Name:ssms
 * File Name:UrlFilter.java
 * Package Name:com.jyd.filter
 * Date:2018年4月8日下午11:33:06
 * Copyright (c) 2018
 */
package com.jyd.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * ClassName: UrlFilter
 * Comment:
 * Time: 2018年4月8日 下午11:33:06
 * Author:sylar
 * @Version 
 * @Since JDK 1.8
 */
public class UrlFilter implements Filter{

	/**
	 * TODO 
	 * @see javax.servlet.Filter#destroy()
	 */
	@Override
	public void destroy() {
	}

	/**
	 * TODO 
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
	}

	/**
	 * TODO 
	 * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
	 */
	@Override
	public void init(FilterConfig arg0) throws ServletException {
	}

}
