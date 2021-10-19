package com.example.demoThymeleaf.service;

import java.util.List;
import java.util.Map;

import com.example.demoThymeleaf.entity.Competence;
import com.example.demoThymeleaf.entity.Experience;
import com.example.demoThymeleaf.entity.Formation;

public interface ICvService {
public List<Competence> listAllCompetences();
public List<Formation> listAllFormations();
public List<Experience> listAllExperiences();
public Map<String, List> listAllCvItems();
}

