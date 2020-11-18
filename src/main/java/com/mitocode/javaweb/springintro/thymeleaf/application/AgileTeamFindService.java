package com.mitocode.javaweb.springintro.thymeleaf.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.javaweb.springintro.thymeleaf.domain.AgileTeam;
import com.mitocode.javaweb.springintro.thymeleaf.infraestructure.repository.DeveloperInMemoryRepository;
import com.mitocode.javaweb.springintro.thymeleaf.infraestructure.repository.ProductOwnerInMemoryRepository;
import com.mitocode.javaweb.springintro.thymeleaf.infraestructure.repository.ScrumMasterInMemoryRepository;

@Service
public class AgileTeamFindService {

	@Autowired
	private DeveloperInMemoryRepository developerInMemoryRepository;

	@Autowired
	private ScrumMasterInMemoryRepository scrumMasterInMemoryRepository;

	@Autowired
	private ProductOwnerInMemoryRepository productOwnerInMemoryRepository;
	
	public AgileTeam getTeam(String name) {
		AgileTeam agileTeam = new AgileTeam(name);
		
		productOwnerInMemoryRepository.findAll().ifPresent(agileTeam::setProductOwner);
		scrumMasterInMemoryRepository.findAll().ifPresent(agileTeam::setScrumMaster);
		developerInMemoryRepository.findAll().stream().forEach(agileTeam.getDevelopers()::add);
		
		return agileTeam;
	}
}
