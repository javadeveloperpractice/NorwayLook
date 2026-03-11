package com.lab.norwaylook.service;

import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab.norwaylook.config.MyConfigurationFileForWords;

@Service
public class NorwayLookTranslationServiceImpl implements NorwayLookTranslationService {

	@Autowired
	private MyConfigurationFileForWords myConfigurationFileForWords;
	private final Random random = new Random();


	@Override
	public Map<String, List<String>> getListOfWorldsMethod() {
		
		Map<String, List<String>> listOfWords = myConfigurationFileForWords.getListOfWords();	
		
		System.out.println(listOfWords.keySet());
		
		return listOfWords;
	}

	@Override
	public boolean checkTranslation(String userString, String originalString) {

		return false;
	}

}
