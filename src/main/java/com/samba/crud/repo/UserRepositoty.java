package com.samba.crud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samba.crud.model.User;

public interface UserRepositoty extends JpaRepository<User, Integer>{

}
