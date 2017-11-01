package com.demo;

import java.util.List;

import org.springframework.stereotype.Service;

import io.ebean.Ebean;
import io.ebean.EbeanServer;

@Service
public class UserService {

	private EbeanServer ebeanServer = Ebean.getDefaultServer();

	public List<User> getAll() {
		return ebeanServer.find(User.class).setFirstRow(0).setMaxRows(10).findList();
	}

	public List<Mail> getById(Integer id) {

		return ebeanServer.find(Mail.class).setDisableLazyLoading(true).select("username").fetch("user").findList();
	}

	public List test() {
		// String sql = "select mail from email where id=:id";
		// Query<Mail> query = ebeanServer.find(Mail.class);
		// RawSql rawSql = RawSqlBuilder.parse(sql).create();
		// query.setRawSql(rawSql);
		// query.setParameter("id", 2);
		List<User> user = ebeanServer.find(User.class).setDisableLazyLoading(true).select("id,username").findList();
		return user;
	}
}
