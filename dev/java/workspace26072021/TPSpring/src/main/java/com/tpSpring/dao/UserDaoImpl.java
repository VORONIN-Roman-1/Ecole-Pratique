package com.tpSpring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tpSpring.entity.User;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<User> getUsers() {
		Session session = sessionFactory.getCurrentSession();
		Query<User> query = session.createQuery("from User", User.class);
		List<User> users = query.getResultList();
	
		return users;
	}
	@Override
	public void saveUser(User user ) {
		Session session = sessionFactory.getCurrentSession();
//		session.save(user);
		//	if(user.getId() ==0)session.save(user);
		//	else session.update(user);
		session.saveOrUpdate(user);
		
	}
	@Override
	public User getUser(int id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(User.class, id);
	}
	
}
