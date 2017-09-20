package com.example.languageFactory;

public class ScriptLanguageFactoryProducer {
	public static ScriptLanguageFactory getScriptLanguageFactory(String name) {
		if (name.equals("SCRIPT")) {
			return new ScriptLanguageFactoryImpl();
		} else
			return null;
	}
}
