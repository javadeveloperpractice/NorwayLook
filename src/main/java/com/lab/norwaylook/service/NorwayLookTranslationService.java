package com.lab.norwaylook.service;

import java.util.List;
import java.util.Map;

public interface NorwayLookTranslationService {

	public Map<String, List<String>> getListOfWorldsMethod();
	
	public boolean checkTranslation(String userString, String originalString);
}
