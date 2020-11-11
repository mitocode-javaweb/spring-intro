package com.mitocode.javaweb.springintro.agile.report;

import org.springframework.stereotype.Component;

@Component
public class ScrumMasterReport implements TeamReport {

	@Override
	public String getReport() {
		return "SM - indicadores del equipo";
	}

}
