package com.jnfragoso.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jnfragoso.workshopmongo.domain.User;
import com.jnfragoso.workshopmongo.repository.UserRepository;
import com.jnfragoso.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
    @Autowired
    private UserRepository repo;

    // Buscar todos os usuários
    public List<User> findAll() {
        return repo.findAll();
    }

    // Buscar usuário por ID
    public User findById(String id) {
        return repo.findById(id)
                   .orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
