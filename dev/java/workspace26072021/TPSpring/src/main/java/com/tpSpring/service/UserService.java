package com.tpSpring.service;

import java.util.List;

import com.tpSpring.entity.User;

public interface UserService {

	public List<User> getUsers();
	
	public void saveUser(User user);
	
}
