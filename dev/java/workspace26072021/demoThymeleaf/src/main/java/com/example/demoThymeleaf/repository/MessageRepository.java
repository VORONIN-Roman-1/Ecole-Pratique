package com.example.demoThymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoThymeleaf.entity.Message;
@Repository
public interface MessageRepository extends JpaRepository<Message, Integer> {

}
