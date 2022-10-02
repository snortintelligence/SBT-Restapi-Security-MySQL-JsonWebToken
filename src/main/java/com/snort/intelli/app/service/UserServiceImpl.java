package com.snort.intelli.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snort.intelli.app.dao.UserDao;
import com.snort.intelli.app.entity.User;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public User registerNewUser(User user) {
		log.info("UserServiceImpl : registerNewUser executed!");
		return userDao.save(user);
	}

}
