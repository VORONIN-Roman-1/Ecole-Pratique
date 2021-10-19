package com.ecole.crudapidemo.dao;

import java.util.List;
import javax.persistence.EntityManager;


import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecole.crudapidemo.entity.Message;

@Repository
public class MessageDaoHibernateImpl implements JpaRepository<T, ID> {
	private EntityManager entityManager;

	@Autowired
	public MessageDaoHibernateImpl(EntityManager em) {
		entityManager = em;
	}

	@Override
	@Transactional
	public List<Message> findAll() {
		// récupérer la session hibernate courante
		Session currentSession = entityManager.unwrap(Session.class);
		// créer une query (une requête)
		Query<Message> query = currentSession.createQuery("from Message", Message.class);
		// executer la requête et récupérer le résultat
		List<Message> messages = query.getResultList();
		// retourner le résultat
		return messages;

	}

	@Override
	public void addMessage(Message message) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.save(message);

	}

	@Override
	public Message findById(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Message message = currentSession.find(Message.class, id);
		return message;
	}
}
