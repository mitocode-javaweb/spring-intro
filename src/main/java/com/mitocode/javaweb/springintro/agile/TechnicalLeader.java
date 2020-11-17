package com.mitocode.javaweb.springintro.agile;

import com.mitocode.javaweb.springintro.agile.report.TeamReport;

public class TechnicalLeader implements TeamMember {

	private TeamReport report;
	
	public TechnicalLeader(TeamReport report) {
		this.report = report;
	}

	@Override
	public String doAction() {
		return "Tech - evalua soluciones técnicas";
	}

	@Override
	public String doReport() {
		return report.getReport();
	}

}
