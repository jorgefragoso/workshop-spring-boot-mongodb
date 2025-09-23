package com.jnfragoso.workshopmongo.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.jnfragoso.workshopmongo.dto.AuthorDto;
import com.jnfragoso.workshopmongo.dto.CommentDTO;

@Document
public class Post implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String title;
	private Date date;
	private String body;
	private AuthorDto author;
	
	private List<CommentDTO> comments = new ArrayList<>();
	
	public Post() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
	public List<CommentDTO> getComments() {
		return comments;
	}

	public void setComments(List<CommentDTO> comments) {
		this.comments = comments;
	}

	public Post(String id, Date date,String title, String body, AuthorDto author) {
		super();
		this.id = id;
		this.title = title;
		this.date = date;
		this.body = body;
		this.author = author;
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		return Objects.equals(id, other.id);
	}

	public AuthorDto getAuthor() {
		return author;
	}

	public void setAuthor(AuthorDto author) {
		this.author = author;
	}

	
	
	
}
