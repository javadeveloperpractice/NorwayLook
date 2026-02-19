package com.lab.norwaylook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lab.norwaylook.service.NorwayLookTranslationService;

@Controller
public class MyControllerNorway {
	
	@Autowired
	private NorwayLookTranslationService norwayLookTranslationService;
	
	@GetMapping ("/norwaylook")
	public String getFirstNorway() {
		return "norwaylook";
	}
	
	@GetMapping ("/norwaylook/tenses") 
	public String getTensen(Model model) {		
		String stringPastTensen = norwayLookTranslationService.getPastTensenString();
		model.addAttribute("stringPastTensen", stringPastTensen);	
		return "tenses";
	}
	
	@PostMapping ("/norwaylook/tenses")
	public String getTensenPractice(@RequestParam("userString") String userString, 
			@RequestParam("originalString") String originalString, Model model) {
		
		boolean correct = norwayLookTranslationService.checkTranslation(userString,
				originalString);
		model.addAttribute("correct", correct);
		model.addAttribute("userText", userString);
		model.addAttribute("originalString", originalString);
		
		return "tenses";
	}
}
