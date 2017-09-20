package com.example.languageFactory;

public class LanguageFactoryProducer {
	public static LanguageFactory getLanguageFactory(String name) {
		if (name.equals("LANGUAGE")) {
			return new LanguageFactoryImpl();
		} else
			return null;
	}
}
