package com.mitocode.javaweb.springintro.agile.report;

import org.springframework.stereotype.Component;

@Component
public class DeveloperReport implements TeamReport {

	@Override
	public String getReport() {
		return "Dev - avance diario de la historia";
	}

}
