package com.tld.dao;

import java.util.List;

 

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tld.entity.User;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<User> getUsers() {
		// récupérer une session hibernate
		Session session = sessionFactory.getCurrentSession();
		
		// créer une requête 
		Query<User> query= session.createQuery("from  User order by lastName",
												User.class);
		
		//executer la requête , récupérer son résultat
		List<User> users = query.getResultList();
	
		return users;
	}

	@Override
	public void saveUser(User user) {
		// récupérer une session hibernate
		Session session = sessionFactory.getCurrentSession();
		
		//save OR update  the user
		session.saveOrUpdate(user); //<=> if(user.id ==null) session.save(user); else session.update(user)
		
	}

	@Override
	public User getUser(int id) {
		// récupérer une session hibernate
		Session session = sessionFactory.getCurrentSession();
		// requêter dans la base le user désiré
		User user = session.get(User.class, id);
		// retourner l'objet
		return user;
	}

	@Override
	public void delete(int id) {
		// récupérer une session hibernate
		Session session = sessionFactory.getCurrentSession();
		//supprimer l'objet avec son id
		//previous solution works
		Query query= session.createQuery("delete from User where id=:unId" );
		query.setParameter("unId", id);
		query.executeUpdate(); 
		
	}

	@Override
	public List<User> searchUsers(String searchedName) {
		// récupérer une session hibernate
		Session session = sessionFactory.getCurrentSession();
				
        Query query = null;
        // only search by name if theSearchName is not empty
        if (searchedName != null && searchedName.trim().length() > 0) {

            // search for firstName or lastName ... case insensitive
            query =session.createQuery("from User where lower(firstName) like :unNom or lower(lastName) like :unNom", User.class);
            query.setParameter("unNom", "%" + searchedName.toLowerCase() + "%");

        }
        else {
            // searchedName is empty ... so just get all users
           query =session.createQuery("from User",User.class);            
        }
        
        // execute query and get result list
        List<User> users = query.getResultList();
                
        // return the results        
        return users;
        
    }
		
		
}


