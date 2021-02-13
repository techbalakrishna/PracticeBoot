package com.samba.crud.service;

import java.util.List;
import java.util.Optional;

import com.samba.crud.model.User;

public interface UserService {
public User createUser(User user);
public List<User> getAllUsers();
public Optional<User> getUserById(int id);
public User DeleteUser(int id);
public User UpdateUser(int id);
}
