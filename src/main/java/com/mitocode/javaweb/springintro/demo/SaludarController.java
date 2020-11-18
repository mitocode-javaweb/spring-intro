package com.mitocode.javaweb.springintro.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SaludarController {
	
	@RequestMapping(value = "/saludar", method = RequestMethod.POST)
	@ResponseBody
	public String postSaludar() {
		return "Hola Coder!";
	}

	@GetMapping("/hello")
	@ResponseBody
	public String hello(
			@RequestParam(name = "name", required = false, defaultValue = "Coder") 
			String name) {
		return "Hello " + name + " !!!";
	}
	
	@GetMapping("/saludar")
	public String getSaludar(
			@RequestParam(name = "name", required = false, defaultValue = "Coder") 
			String name,
			Model model) {
		model.addAttribute("nombre", name);
		
		return "saludar";
	}
}
