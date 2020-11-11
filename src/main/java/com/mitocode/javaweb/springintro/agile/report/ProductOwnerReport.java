package com.mitocode.javaweb.springintro.agile.report;

import org.springframework.stereotype.Component;

@Component
public class ProductOwnerReport implements TeamReport {

	@Override
	public String getReport() {
		return "PO - Producto backlog completo";
	}

}
