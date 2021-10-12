package com.tld.service;

import java.util.List;

import com.tld.entity.User;

public interface UserService {

	public List<User> getUsers();

	public void saveUser(User user);

	public User getUser(int id);

	public void delete(int id);

	public List<User> searchUsers(String searchedName);
}
