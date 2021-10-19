package com.example.demoThymeleaf.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoThymeleaf.entity.Competence;
import com.example.demoThymeleaf.entity.Experience;
import com.example.demoThymeleaf.entity.Formation;
import com.example.demoThymeleaf.repository.CompetenceRepository;
import com.example.demoThymeleaf.repository.ExperienceRepository;
import com.example.demoThymeleaf.repository.FormationRepository;

@Service
public class CvService implements ICvService {
	@Autowired
	private CompetenceRepository competenceRepo;
	@Autowired
	private ExperienceRepository experienceRepo;
	@Autowired
	private FormationRepository formationRepo;

	@Override
	public List<Competence> listAllCompetences() {
	return competenceRepo.findAll();
	}
	@Override
	public List<Formation> listAllFormations() {
	return formationRepo.findAll();
	}
	@Override
	public List<Experience> listAllExperiences() {
	return experienceRepo.findAll();
	}
	@Override
	public Map<String, List> listAllCvItems() {
	List<Competence> competences = listAllCompetences();
	List<Experience> experiences = listAllExperiences();
	List<Formation> formations = listAllFormations();
	Map<String, List> map = new HashMap<>();
	map.put("competences", competences);
	map.put("experiences", experiences);
	map.put("formations", formations); 
	return map;
	}
	}

