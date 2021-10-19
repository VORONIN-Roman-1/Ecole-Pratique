package com.example.demoThymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoThymeleaf.entity.Formation;

public interface FormationRepository extends JpaRepository<Formation, Long> {


}
