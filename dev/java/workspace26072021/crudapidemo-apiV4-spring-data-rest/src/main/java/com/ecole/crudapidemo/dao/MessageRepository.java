package com.ecole.crudapidemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecole.crudapidemo.entity.Message;

public interface MessageRepository extends JpaRepository<Message, Integer> {

}
