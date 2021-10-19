package com.example.demoThymeleaf.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demoThymeleaf.entity.Competence;
import com.example.demoThymeleaf.entity.Experience;
import com.example.demoThymeleaf.entity.Formation;
import java.time.LocalDate;
import java.time.Month;

@Component
public class MyDataLoader implements CommandLineRunner {
	private static final Logger logger = LoggerFactory.getLogger(MyDataLoader.class);
	@Autowired
	private CompetenceRepository competenceRepo;
	@Autowired
	private ExperienceRepository experienceRepo;
	@Autowired
	private FormationRepository formationRepo;

	@Override
	public void run(String... args) throws Exception {
		competenceRepo.save(new Competence("Java", "images/logoJVM", 3));
		competenceRepo.save(new Competence("Hibernate", "images/logoHibernate", 3));
		competenceRepo.save(new Competence("Javascript", "images/logoJS", 5));
		competenceRepo.save(new Competence("Spring", "images/logoSpring", 2));
		competenceRepo.save(new Competence("Git", "images/logoJVM", 3));
		competenceRepo.save(new Competence("Html", "images/logoHtml", 4));
		competenceRepo.save(new Competence("Css", "images/logoCss", 5));
		competenceRepo.save(new Competence("Bootstrap", "images/logoBootstrap", 5));

		experienceRepo.save(new Experience("Atos", LocalDate.of(2018, Month.APRIL, 12),
				LocalDate.of(2021, Month.NOVEMBER, 30), "developpeur Front end"));
		experienceRepo.save(new Experience("Projet personnel", LocalDate.of(2018, Month.DECEMBER, 01),
				LocalDate.of(2019, Month.JUNE, 30), "développeur"));
		formationRepo.save(new Formation("CCI Ecole pratique java", LocalDate.of(2019, Month.JULY, 01),
				LocalDate.of(2020, Month.MARCH, 31), "Java", "bac"));
		formationRepo.save(new Formation("Lycee Gustave Eiffel à Lyon", LocalDate.of(2015, Month.SEPTEMBER, 01),
				LocalDate.of(2017, Month.JUNE, 30), "Développement Web", "BTS"));
	}
}
