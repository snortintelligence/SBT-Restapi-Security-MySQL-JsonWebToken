package com.snort.intelli.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snort.intelli.app.dao.RoleDao;
import com.snort.intelli.app.entity.Role;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDao roleDao;

	@Override
	public Role createNewRole(Role role) {
		log.info("RoleServiceImpl : createNewRole executed!");
		return roleDao.save(role);
	}

}
