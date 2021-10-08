package com.tld.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tld.entities.User;

@Repository
public class UserDaoImpl implements UserDao {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<User> getAllUsers() {
		Session session = sessionFactory.getCurrentSession();
		
		Query<User> query = session.createQuery("from User", User.class);
		 
		List<User> users =  query.getResultList();
		return users;
	}

}
