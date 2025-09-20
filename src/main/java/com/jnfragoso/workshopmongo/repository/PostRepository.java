package com.jnfragoso.workshopmongo.repository;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jnfragoso.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository <Post, Serializable> {
	
}
