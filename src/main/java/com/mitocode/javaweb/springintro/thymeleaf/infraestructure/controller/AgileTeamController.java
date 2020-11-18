package com.mitocode.javaweb.springintro.thymeleaf.infraestructure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mitocode.javaweb.springintro.thymeleaf.application.AgileTeamFindService;

@Controller
public class AgileTeamController {

	@Autowired
	private AgileTeamFindService agileTeamFindService;
	
	@Value("${spring.application.name}")
	private String teamName;
	
	@GetMapping("/view-team")
	public String viewTeam(Model model) {
		model.addAttribute("agileTeam", agileTeamFindService.getTeam(teamName));
	
		return "agileTeam";
	}

}
