package com.lab.norwaylook.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.lab.norwaylook.model.Sentence;

@Service
public class NorwayLookTranslationServiceImpl implements NorwayLookTranslationService {
	
	private Sentence sentence;

	@Override
	public String getPastTensenString() {
		
		List<Sentence> pastTensenString = new ArrayList<>();
		pastTensenString.add(new Sentence("Я був вдома", List.of("Jeg var hjemme")));
		pastTensenString.add(new Sentence("Вона була вдома", List.of("Hun var hjemme")));
		pastTensenString.add(new Sentence("Вони були вдома", List.of("De var hjemme")));
		pastTensenString.add(new Sentence("Ми були вдома", List.of("Vi var hjemme")));
		
		Random random = new Random();
		Sentence randomSentence = pastTensenString.get(random.nextInt(pastTensenString.size()));
		
		return randomSentence.toString();
	}

	@Override
	public boolean checkTranslation(String userString, String originalString) {
		// TODO Auto-generated method stub		
		return sentence.check(userString);
	}

}
