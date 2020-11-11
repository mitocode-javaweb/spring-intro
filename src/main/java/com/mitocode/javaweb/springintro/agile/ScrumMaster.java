package com.mitocode.javaweb.springintro.agile;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.mitocode.javaweb.springintro.agile.report.TeamReport;

//@Component("scrumMaster123")
@Component
public class ScrumMaster implements TeamMember {
	
	private static final Logger log = LoggerFactory.getLogger(ScrumMaster.class);

	private TeamReport report;
	
	@Override
	public String doAction() {
		return "SM - Resolver impedimentos del equipo";
	}

	@Override
	public String doReport() {
		return report.getReport();
	}

	@Autowired
	public void metodoDeInyeccion(TeamReport scrumMasterReport) {
		this.report = scrumMasterReport;
	}
	
	@PostConstruct
	public void initBean() {
		log.debug("SM Ini: Inicialización de ScrumMaster");
	}
	
	@PreDestroy
	public void beforeDestroy() {
		log.debug("SM End: Liberando ScrumMaster");
	}
}
