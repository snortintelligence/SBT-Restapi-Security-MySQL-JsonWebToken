package com.snort.intelli.app.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Data
public class User {

	@Id
	private String username;
	private String firstName;
	private String lastName;
	private String userPassword;
	
	//user has some roles
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "USER_ROLE" , joinColumns = {
			@JoinColumn(name = "USER_ID")
	} , inverseJoinColumns = {
			@JoinColumn(name = "ROLE_ID")
	})
	private Set<Role> roles;
	
}
