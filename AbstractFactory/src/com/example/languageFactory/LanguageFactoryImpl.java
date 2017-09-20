package com.example.languageFactory;

import com.example.language.CLanguageImpl;
import com.example.language.JavaLanguageImpl;
import com.example.language.Language;

public class LanguageFactoryImpl extends LanguageFactory {
	public Language getLanguage(String name) {
		if (name.equals("C"))
			return new CLanguageImpl();
		else if (name.equals("JAVA"))
			return new JavaLanguageImpl();
		else
			return null;
	}
}
