package com.lab.norwaylook.service;

public interface NorwayLookTranslationService {

	public String getPastTensenString();
	public boolean checkTranslation(String userString, String originalString);
}
