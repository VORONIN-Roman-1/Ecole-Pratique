package com.tld.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tld.dao.UserDao;
import com.tld.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	
	@Override
	@Transactional
	public List<User> getUsers() {
		return userDao.getUsers();
	}


	@Override
	@Transactional
	public void saveUser(User user) {
		 userDao.saveUser(user);
	}


	@Override
	@Transactional
	public User getUser(int id) {
		User user= userDao.getUser(id);
		return user;
	}


	@Override
	@Transactional
	public void delete(int id) {
		userDao.delete(id);
	}


	@Override
	@Transactional
	public List<User> searchUsers(String searchedName) {
		
		return userDao.searchUsers(searchedName);
	}

}
