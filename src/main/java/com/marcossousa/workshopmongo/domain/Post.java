package com.marcossousa.workshopmongo.domain;

import java.io.Serializable;
import java.time.Instant;

public class Post implements Serializable {
	private static final long serialVersionUID = 1L;

	private String   id;
	private Instant  date;
	private String   title;
	private String   body;
	
	
	public Post() {
	}


	public Post(String id, Instant date, String title, String body) {
		this.id = id;
		this.date = date;
		this.title = title;
		this.body = body;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public Instant getDate() {
		return date;
	}


	public void setDate(Instant date) {
		this.date = date;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getBody() {
		return body;
	}


	public void setBody(String body) {
		this.body = body;
	}
	
	
	
}
