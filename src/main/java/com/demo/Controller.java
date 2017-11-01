package com.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	private UserService userService;

	@RequestMapping("user/getAll")
	public List<User> getAll() {
		return userService.getAll();
	}

	@RequestMapping("user/getById")
	public List<Mail> getById(@RequestParam(value = "id") Integer id) {
		return userService.getById(id);
	}

	@RequestMapping("/test")
	public List test() {
		return userService.test();
	}

}
