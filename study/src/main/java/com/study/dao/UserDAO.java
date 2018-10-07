package com.study.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
	public String login() {
		System.out.println("DAO");
		return "Success";
	}
}
