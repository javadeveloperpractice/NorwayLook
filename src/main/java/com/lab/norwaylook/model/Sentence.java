package com.lab.norwaylook.model;

import java.util.List;

public class Sentence {

	private String ukrainianText;
	private List<String> norwegianTranslations;

	public Sentence() {
		super();
	}

	public Sentence(String uk, List<String> no) {
		this.ukrainianText = uk;
		this.norwegianTranslations = no;
	}

	public boolean check(String userString) {

		String cleanedUserString = userString.replaceAll("\\s+", "");

		for (String variant : norwegianTranslations) {

			String cleanedVariant = variant.replaceAll("\\s+", "");

			if (cleanedUserString.equalsIgnoreCase(cleanedVariant)) {
				return true;
			}
		}

		return false;
	}

	@Override
	public String toString() {
		return "Sentence [ukrainianText=" + ukrainianText + ", norwegianTranslations=" + norwegianTranslations + "]";
	}

}
