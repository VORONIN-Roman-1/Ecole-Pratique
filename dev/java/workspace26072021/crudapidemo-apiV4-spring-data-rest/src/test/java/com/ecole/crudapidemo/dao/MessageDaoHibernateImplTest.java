package com.ecole.crudapidemo.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ecole.crudapidemo.entity.Message;

@SpringBootTest
public class MessageDaoHibernateImplTest {

	@Autowired
	private MessageRepository dao;

	@Test
	void test() {
		System.out.println(
				"Je suis un autre classe de test dédiée aux tests de l'accès aux données  relatives aux Messages.");
	}

	@Test
	@DisplayName("findAll Message DAO test 1")
	public void test1() {
		System.out.println("on teste le serviceMessage   findAll");
		for (Message m : dao.findAll())
			System.out.println(m);
	}

	@Test
	@DisplayName("findAll Message DAO test 2")
	public void test2() {
		System.out.println("on teste le service");
		assertEquals(5, dao.findAll().size(), "le nombre de messages en bdd est erroné.");
	}

}
