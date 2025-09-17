package com.jnfragoso.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jnfragoso.workshopmongo.domain.User;
import com.jnfragoso.workshopmongo.dto.UserDTO;
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
    
    public User insert(User obj) {
    	return repo.insert(obj);
    }
   
    
    public void delete(String id) {
    	findById(id);
    	repo.deleteById(id);
    }
    
    public User update(User obj) {
        User newObj = repo.findById(obj.getId())
                          .orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
        updateData(newObj, obj);
        return repo.save(newObj);
    }

    
    private void updateData(User newObj, User obj) {
		newObj.setName(obj.getName());
		newObj.setEmail(obj.getEmail());
		
	}

	public User fromDTO(UserDTO objDto) {
    return new User(objDto.getId(),objDto.getName(),objDto.getEmail());	
    }
    
}
