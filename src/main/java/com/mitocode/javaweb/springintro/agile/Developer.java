package com.mitocode.javaweb.springintro.agile;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mitocode.javaweb.springintro.agile.report.TeamReport;

@Component
@Scope("prototype")
public class Developer implements TeamMember {

	private static final Logger log = LoggerFactory.getLogger(Developer.class);

	@Autowired
	@Qualifier("developerReport")
	private TeamReport report;

	private String name;

	@Value("${developer-esfuerzo}")
	private Integer pointsUserHistories;

	@Override
	public String doAction() {
		return "Dev - ejecutar historias de usuario";
	}

	@Override
	public String doReport() {
		return report.getReport();
	}

	@PostConstruct
	public void initBean() {
		log.debug("Dev Ini: Inicialización de Developer");
	}

	@PreDestroy
	public void beforeDestroy() {
		log.debug("Dev End: Liberando Developer");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPointsUserHistories() {
		return pointsUserHistories;
	}

}
