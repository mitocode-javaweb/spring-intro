package com.mitocode.javaweb.springintro.thymeleaf.infraestructure.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.mitocode.javaweb.springintro.thymeleaf.domain.Developer;
import com.mitocode.javaweb.springintro.thymeleaf.domain.MemberType;

@Repository
public class DeveloperInMemoryRepository {

	public List<Developer> findAll() {
		return Arrays.asList(
				new Developer("Emilio"),
				new Developer("Juan Pablo", MemberType.DEVELOPER_FRONTEND),
				new Developer("Yenuri", MemberType.DEVELOPER_BACKEND),
				new Developer("Rafael", MemberType.DEVELOPER_QA),
				new Developer("Veiko", MemberType.DEVELOPER_FRONTEND));
	}

}
