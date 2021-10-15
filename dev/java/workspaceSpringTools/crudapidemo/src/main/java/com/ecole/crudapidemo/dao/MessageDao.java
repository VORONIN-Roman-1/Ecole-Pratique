package com.ecole.crudapidemo.dao;

import java.util.List;
import com.ecole.crudapidemo.entity.Message;

public interface MessageDao {
	public List<Message> findAll();
	public void addMessage(Message message);
	public Message findById(int id);
}

