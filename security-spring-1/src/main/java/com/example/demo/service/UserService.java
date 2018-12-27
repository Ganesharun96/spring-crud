package com.example.demo.service;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Usersdetails;
import com.example.demo.repositories.UserRepositories;

@Service
public class UserService { 
	
@Autowired
	private UserRepositories userrepo;
	public Usersdetails save(Usersdetails usersdetails) {
		return userrepo.save(usersdetails);
		
	}

}
