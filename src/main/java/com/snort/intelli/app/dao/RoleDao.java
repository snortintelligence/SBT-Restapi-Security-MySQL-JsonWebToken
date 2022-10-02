package com.snort.intelli.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.snort.intelli.app.entity.Role;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {

}
