package com.mitocode.javaweb.springintro.thymeleaf.domain;

import java.util.ArrayList;
import java.util.List;

public class AgileTeam {

	private String name;

	private ScrumMaster scrumMaster;
	
	private ProductOwner productOwner;
	
	private List<Developer> developers;

	public AgileTeam(String name) {
		this.name = name;
		this.developers = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public ScrumMaster getScrumMaster() {
		return scrumMaster;
	}

	public void setScrumMaster(ScrumMaster scrumMaster) {
		this.scrumMaster = scrumMaster;
	}

	public ProductOwner getProductOwner() {
		return productOwner;
	}

	public void setProductOwner(ProductOwner productOwner) {
		this.productOwner = productOwner;
	}

	public List<Developer> getDevelopers() {
		return developers;
	}

	public void setDevelopers(List<Developer> developers) {
		this.developers = developers;
	}
}
