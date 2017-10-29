package com.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.ebean.Model;

@Entity
@Table(name = "email")
public class Mail extends Model {
	@Id
	private Integer id;

	private String mail;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Mail(Integer id, String mail, User user) {
		this.id = id;
		this.mail = mail;
		this.user = user;
	}

	public Mail() {
	}

}
