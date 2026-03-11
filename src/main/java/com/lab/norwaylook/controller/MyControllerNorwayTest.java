package com.lab.norwaylook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lab.norwaylook.service.NorwayLookTranslationService;
 
@RestController
@RequestMapping("/norwaylook/test")
public class MyControllerNorwayTest {
	
	@Autowired
	private NorwayLookTranslationService norwayLookTranslationService;

    @GetMapping("/run")
    public String runTest() {
    	
        System.out.println("=== Тест запущено! ===");    
        
        System.out.println(norwayLookTranslationService.getListOfWorldsMethod().toString());

        System.out.println("=== Тест завершено! ===");     
        return "Тест виконано успішно! Перевір консоль IDE.";
    }
}