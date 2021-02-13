package com.samba.crud.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.samba.crud.model.User;
import com.samba.crud.service.UserService;

@RestController
public class UserController {
private UserService service;
public User createUser(@RequestBody User user) {
	return service.createUser(user);
}
}
