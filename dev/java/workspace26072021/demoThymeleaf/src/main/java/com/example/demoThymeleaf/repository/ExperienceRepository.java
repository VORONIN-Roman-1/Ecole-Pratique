package com.example.demoThymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoThymeleaf.entity.Experience;

public interface ExperienceRepository extends JpaRepository<Experience, Long> {
}

