package com.study.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.study.dao.UserDAO;

@Component
@Qualifier
public class UserServiceImpl2 implements UserService{
	@Autowired
	UserDAO userDao;
	
	public String login() {
		System.out.println("Service2");
		return userDao.login();
	}
}
