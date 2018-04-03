/**
 * Project Name:ssms
 * File Name:UserRealm.java
 * Package Name:com.jyd.realm
 * Date:2018年4月1日上午12:51:38
 * Copyright (c) 2018
 */
package com.jyd.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * ClassName: UserRealm
 * Comment:
 * Time: 2018年4月1日 上午12:51:38
 * Author:sylar
 * @Version 
 * @Since JDK 1.8
 */
public class UserRealm extends AuthorizingRealm{

	/**
	 * TODO 
	 * @see org.apache.shiro.realm.AuthorizingRealm#doGetAuthorizationInfo(org.apache.shiro.subject.PrincipalCollection)
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		return null;
	}

	/**
	 * TODO 
	 * @see org.apache.shiro.realm.AuthenticatingRealm#doGetAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken)
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken arg0) throws AuthenticationException {
		return null;
	}

}
