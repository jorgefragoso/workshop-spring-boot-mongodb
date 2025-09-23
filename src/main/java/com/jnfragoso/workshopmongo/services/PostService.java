package com.jnfragoso.workshopmongo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jnfragoso.workshopmongo.domain.Post;
import com.jnfragoso.workshopmongo.repository.PostRepository;
import com.jnfragoso.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
    @Autowired
    private PostRepository repo;

    // Buscar post por ID
    public Post findById(String id) {
        return repo.findById(id)
                   .orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
