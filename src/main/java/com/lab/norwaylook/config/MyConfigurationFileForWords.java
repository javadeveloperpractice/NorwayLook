package com.lab.norwaylook.config;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "norwaylook")
public class MyConfigurationFileForWords {

	private Map<String, List<String>> listOfWords = new HashMap<>();


	public Map<String, List<String>> getListOfWords() {
		return listOfWords;
	}

	public void setListOfWords(Map<String, List<String>> listOfWords) {
		this.listOfWords = listOfWords;
	}

	@Override
	public String toString() {
		return "MyConfigurationFileForWords [listOfWords=" + listOfWords + "]";
	}

}
