package com.example.main;

import com.example.language.Language;
import com.example.languageFactory.LanguageFactory;
import com.example.languageFactory.LanguageFactoryProducer;
import com.example.languageFactory.ScriptLanguageFactory;
import com.example.languageFactory.ScriptLanguageFactoryProducer;
import com.example.scripting.ScriptingLanguage;

public class LanguageGenerator {
	public static void main(String a[]) {
		LanguageFactory languageFactory = LanguageFactoryProducer.getLanguageFactory("LANGUAGE");
		Language cLanguage = languageFactory.getLanguage("C");
		System.out.println(cLanguage.getName());
		ScriptLanguageFactory scriptLanguageFactory = ScriptLanguageFactoryProducer.getScriptLanguageFactory("SCRIPT");
		ScriptingLanguage pythonScriptLanguage = scriptLanguageFactory.getLanguage("PYTHON");
		System.out.println(pythonScriptLanguage.getScriptName());
	}
}
