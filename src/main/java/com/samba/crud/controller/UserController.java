package com.samba.crud.controller;

import java.util.List;

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

public List<User> getUser(int id) {
	return service.getAllUsers();
}
public User getUserById(int id)	{
	return service.getUserById(id);
}
