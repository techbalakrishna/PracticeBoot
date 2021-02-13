package com.samba.crud.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samba.crud.model.User;
import com.samba.crud.repo.UserRepositoty;
import com.samba.crud.service.UserService;
@Service
public class UserServiceImpl implements UserService{
@Autowired
private UserRepositoty repository;
	@Override
	public User createUser(User user) {
		return repository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return repository.findAll();
	}

	@Override
	public Optional<User> getUserById(int id) {
		return repository.findById(id);
	}

	@Override
	public User DeleteUser(int id) {
		return null;
	}

	@Override
	public User UpdateUser(int id) {
		return null;
	}

}
