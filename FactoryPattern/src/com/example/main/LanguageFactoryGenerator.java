package com.example.main;

import com.example.languages.Language;
import com.example.languages.LanguageFactory;

public class LanguageFactoryGenerator {
	public static void main(String a[]) {
		LanguageFactory languageFactory = new LanguageFactory();
		Language cLanguage = languageFactory.getLanguage("C");
		Language javaLanguage = languageFactory.getLanguage("JAVA");
		generateString(cLanguage);
		generateString(javaLanguage);
	}

	public static void generateString(Language language) {
		if (language.isPlatformDependent())
			System.out.println(language.getName() + " is Platform Dependent");
		else
			System.out.println(language.getName() + " is not Platform Dependent");
	}
}
