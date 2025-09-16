package com.jnfragoso.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jnfragoso.workshopmongo.domain.User;
import com.jnfragoso.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findall() {
		return repo.findAll();
	}
}
