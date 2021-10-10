package com.spring.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.entity.User;
@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}
	
//	@Autowired
//	private SessionFactory sessionFactory;
//	 
//	@Override
//	@Transactional
//	public List<User> getUsers() {
//		Session session = sessionFactory.getCurrentSession();
//		Query<User> query = session.createQuery("from User", User.class);
//		List <User> users = query.getResultList();
//		return users;
//	}

}
