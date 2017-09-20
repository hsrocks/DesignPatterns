package com.example.languageFactory;

import com.example.scripting.ScriptingLanguage;

public abstract class ScriptLanguageFactory {
	public abstract ScriptingLanguage getLanguage(String name);
}
