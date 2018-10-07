package com.study.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.study.dao.UserDAO;

@Component
public class UserServiceImpl implements UserService{
	@Autowired
	UserDAO userDao;
	
	public String login() {
		System.out.println("Service");
		return userDao.login();
	}
}
