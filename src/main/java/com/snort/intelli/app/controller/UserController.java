package com.snort.intelli.app.controller;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.snort.intelli.app.entity.Role;
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
		log.info("UserController {} registerNewUser executed!", user);
		return userService.registerNewUser(user);
	}

	@GetMapping("/forAdmin")
	public String forAdmin() {
		return "This resources access only forAdmin!";
	}

	@GetMapping("/forUser")
	public String forUser() {
		return "This resources access only forUser!";
	}
	
	@GetMapping("/getUser")
	public User getUser() {
		User user = new User();
		user.setFirstName("S");
		user.setLastName("S");
		user.setUserPassword("S");
		Role role = new Role();
		role.setRoleName("Amdin");
		role.setRoleDescription("Admin role");
		HashSet<Role> r = new HashSet<>();
		r.add(role);
		user.setRoles(r);
		return user;
	}

}
