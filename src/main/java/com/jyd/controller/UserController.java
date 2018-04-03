/**
 * Project Name:ssms
 * File Name:UserController.java
 * Package Name:com.jyd.controller
 * Date:2018年3月31日下午11:18:52
 * Copyright (c) 2018
 */
package com.jyd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jyd.service.UserService;

/**
 * ClassName: UserController
 * Comment:
 * Time: 2018年3月31日 下午11:18:52
 * Author:sylar
 * @Version 
 * @Since JDK 1.8
 */
@Controller(value="/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
}
