package com.mitocode.javaweb.springintro.thymeleaf.domain;

public class Developer extends TeamMember {

	public Developer(String name) {
		super(name, MemberType.DEVELOPER);
	}
	
	public Developer(String name, MemberType memberType) {
		super(name, memberType);
	}
	
}
