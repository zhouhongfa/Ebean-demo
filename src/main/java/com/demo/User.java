package com.demo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.ebean.Model;

@Entity
@Table(name = "user")
public class User extends Model implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + "]";
	}

	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "username")
	private String username = null;

	// private List<Mail> mails;

	public User(Integer id, String password) {
		super();
		this.id = id;
		this.password = password;
	}

	@Column(name = "password")
	private String password = null;
	//
	// @OneToMany(cascade = CascadeType.ALL)
	// public List<Mail> getMails() {
	// return mails;
	// }

	// public void setMails(List<Mail> mails) {
	// this.mails = mails;
	// }

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	// public String getPassword() {
	// return password;
	// }
	//
	// public void setPassword(String password) {
	// this.password = password;
	// }

	public User(Integer id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		// this.password = password;
	}

	public User(Integer id, String username, List<Mail> mails) {
		super();
		this.id = id;
		this.username = username;
		// this.mails = mails;
	}

	public User(String username, String password) {
		super();
		this.username = username;
		// this.password = password;
	}

}
