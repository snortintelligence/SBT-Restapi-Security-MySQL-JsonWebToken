package com.snort.intelli.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.snort.intelli.app.entity.User;
import com.snort.intelli.app.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping({ "/registerNewUser" })
	public User registerNewUser(@RequestBody User user) {
		log.info("UserController {} registerNewUser executed!" ,user);
		return userService.registerNewUser(user);
	}

}
