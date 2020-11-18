package com.mitocode.javaweb.springintro.thymeleaf.infraestructure.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.mitocode.javaweb.springintro.thymeleaf.domain.ScrumMaster;

@Repository
public class ScrumMasterInMemoryRepository {

	public Optional<ScrumMaster> findAll() {
		return Optional.of(new ScrumMaster("Jaime Medina"));
	}

}
