package com.tld.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.tld.dao.UserDao;
import com.tld.entities.User;
//@Service
@Component
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao; 
	
	@Override
	@Transactional
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
 
	}

}
