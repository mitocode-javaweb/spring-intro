package com.mitocode.javaweb.springintro.agile;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.mitocode.javaweb.springintro.agile.report.TeamReport;

@Component
@Lazy
public class ProductOwner implements TeamMember {

	private static final Logger log = LoggerFactory.getLogger(ProductOwner.class);

	private TeamReport report;
	
	public ProductOwner() {
		
	}
	
	// cuando existe un único contrsuctor, la anotación @Autowired puede omitirse
	@Autowired
	public ProductOwner(@Qualifier("productOwnerReport") TeamReport report) {
		this.report = report;
	}
//	
//	@Autowired
//	public ProductOwner(TeamReport productOwnerReport) {
//		this.report = productOwnerReport;
//	}

	@Override
	public String doAction() {
		return "PO - Refinando las historias de usuario";
	}

	@Override
	public String doReport() {
		return report.getReport();
	}
	
	@PostConstruct
	public void initBean() {
		log.debug("PO Ini: Inicialización de ProductOwner");
	}
	
	@PreDestroy
	public void beforeDestroy() {
		log.debug("PO End: Liberando ProductOwner");
	}


}
