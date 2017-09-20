package com.example.languageFactory;

import com.example.scripting.PhpScriptLanguageImpl;
import com.example.scripting.PythonScriptImpl;
import com.example.scripting.ScriptingLanguage;

public class ScriptLanguageFactoryImpl extends ScriptLanguageFactory {
	public ScriptingLanguage getLanguage(String name) {
		if (name.equals("PHP"))
			return new PhpScriptLanguageImpl();
		else if (name.equals("PYTHON"))
			return new PythonScriptImpl();
		else
			return null;
	}
}
