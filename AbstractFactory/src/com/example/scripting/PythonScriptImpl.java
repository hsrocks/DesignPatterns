package com.example.scripting;

public class PythonScriptImpl implements ScriptingLanguage {
	private static final String NAME = "Python";

	@Override
	public String getScriptName() {
		return NAME;
	}

}
