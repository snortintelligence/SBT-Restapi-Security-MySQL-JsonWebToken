package com.snort.intelli.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.snort.intelli.app.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, String> {

}
