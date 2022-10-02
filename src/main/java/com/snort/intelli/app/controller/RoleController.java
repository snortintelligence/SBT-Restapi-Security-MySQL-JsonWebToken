package com.snort.intelli.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.snort.intelli.app.entity.Role;
import com.snort.intelli.app.service.RoleService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class RoleController {

	@Autowired
	private RoleService roleService;
	
	@PostMapping({"/createNewRole"})
	public Role createNewRole(@RequestBody Role role) {
		log.info("RoleController : createNewRole executed!");
		return roleService.createNewRole(role);
	}
	
}
