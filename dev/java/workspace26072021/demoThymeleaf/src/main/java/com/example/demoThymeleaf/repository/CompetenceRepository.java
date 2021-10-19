package com.example.demoThymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoThymeleaf.entity.Competence;

public interface CompetenceRepository extends JpaRepository<Competence, Long> {
}
