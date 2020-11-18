package com.mitocode.javaweb.springintro.thymeleaf.domain;

public abstract class TeamMember {

	private String name;

	private MemberType type;
	
	public TeamMember(String name, MemberType type) {
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MemberType getType() {
		return type;
	}

	public void setType(MemberType type) {
		this.type = type;
	}

}
