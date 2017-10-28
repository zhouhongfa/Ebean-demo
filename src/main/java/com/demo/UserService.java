package com.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.ebean.EbeanServer;

@Service
public class UserService {

	@Autowired
	private EbeanServer ebeanServer;

	public List<User> getAll() {
		return ebeanServer.find(User.class).findList();
	}

	public User getById(Integer id) {
		return ebeanServer.find(User.class).where().eq("id", id).findOne();
	}
}
