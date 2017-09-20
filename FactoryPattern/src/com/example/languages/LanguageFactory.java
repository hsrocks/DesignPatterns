package com.example.languages;

public class LanguageFactory {
	public Language getLanguage(String name){
		if(name.equals("C")){
			return new CLanguagleImpl();
		}
		else if(name.equals("JAVA")){
			return new JavaLanguagImpl();
		}
		else 
			return null;
	}
}
