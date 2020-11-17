package com.mitocode.javaweb.springintro.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import com.mitocode.javaweb.springintro.agile.Developer;
import com.mitocode.javaweb.springintro.agile.TeamMember;
import com.mitocode.javaweb.springintro.agile.TechnicalLeader;
import com.mitocode.javaweb.springintro.agile.report.TechnicalLeaderReport;

@SpringBootApplication
@ComponentScan("com.mitocode.javaweb.springintro.agile")
@PropertySources({
		@PropertySource("classpath:demo.properties"),
		@PropertySource(value = "${spring.config.location}", ignoreResourceNotFound = true)
})
public class SpringIntroApplication implements CommandLineRunner {
	
	private static final Logger log = LoggerFactory.getLogger(SpringIntroApplication.class);
	
	@Autowired
//	@Qualifier("scrumMaster123")
	public TeamMember scrumMaster;
	
	@Autowired
	public TeamMember developer;
	
	@Autowired
	@Qualifier("developer")
	public TeamMember developerFrontEnd;
	
	@Autowired
	@Qualifier("developer")
	public TeamMember developerBackEnd;
	
	@Autowired
	@Lazy
	private TeamMember productOwner;

	@Autowired
	@Qualifier("technicalLeader")
	private TeamMember technicalLeader;
	
	@Value("${nombre-equipo}")
	private String teamName;
	

	public static void main(String[] args) {
		SpringApplication.run(SpringIntroApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Info - Hola Coders!");
		
//		TeamMember scrumMaster = new ScrumMaster();
		
		log.info(scrumMaster.doAction());
		log.info(scrumMaster.doReport());
		
//		TeamMember developer = new Developer();
		
		log.info(developer.doAction());
		log.info(developer.doReport());
		
		log.info("Developer: " + developer);
		log.info("FrontEnd: " + developerFrontEnd);
		log.info("BackEnd: " + developerBackEnd);
		
		Developer dev1 = (Developer) developer;
		dev1.setName("Pablo");

		Developer dev2 = (Developer) developerFrontEnd;
		Developer dev3 = (Developer) developerBackEnd;
		
		log.info("Develope.namer: " + dev1.getName());
		log.info("FrontEnd.name: " + dev2.getName());
		log.info("BackEnd.name: " + dev3.getName());
		
		log.info("Develope.pointsUserHistories: " + dev1.getPointsUserHistories());
		log.info("FrontEnd.pointsUserHistories: " + dev2.getPointsUserHistories());
		log.info("BackEnd.pointsUserHistories: " + dev3.getPointsUserHistories());
		
		log.info(productOwner.doAction());
		log.info(productOwner.doReport());
		
		log.info(technicalLeader.doAction());
		log.info(technicalLeader.doReport());
		
		log.info("Nombre del equipo: " + teamName);
		
	}
	
	@Bean("technicalLeader")
	@Autowired
	public TechnicalLeader createTechnicalLeader(TechnicalLeaderReport technicalLeaderReport) {
		return new TechnicalLeader(technicalLeaderReport);
	}
	
	@Bean("technicalLeaderReport")
	public TechnicalLeaderReport createTechnicalLeaderReport() {
		return new TechnicalLeaderReport();
	}

}
