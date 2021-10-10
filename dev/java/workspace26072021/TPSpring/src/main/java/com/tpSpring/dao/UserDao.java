package com.tpSpring.dao;

import java.util.List;

import com.tpSpring.entity.User;

public interface UserDao {

	public List<User> getUsers();
	public void saveUser(User user);
}
