package com.mitocode.javaweb.springintro.agile.report;

public class TechnicalLeaderReport implements TeamReport {

	@Override
	public String getReport() {
		return "Tech - deuda técnica de los componentes";
	}

}
