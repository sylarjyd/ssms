/**
 * Project Name:ssms
 * File Name:SessionListener.java
 * Package Name:com.jyd.listener
 * Date:2018年4月8日下午11:34:42
 * Copyright (c) 2018
 */
package com.jyd.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpServlet;

/**
 * ClassName: SessionListener
 * Comment:
 * Time: 2018年4月8日 下午11:34:42
 * Author:sylar
 * @Version 
 * @Since JDK 1.8
 */
public class SessionListener extends HttpServlet implements ServletContextListener{

	/**
	 * TODO 
	 * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.ServletContextEvent)
	 */
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
	}

	/**
	 * TODO 
	 * @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent)
	 */
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
	}

}
