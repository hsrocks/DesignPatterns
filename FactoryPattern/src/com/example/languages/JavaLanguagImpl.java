package com.example.languages;

public class JavaLanguagImpl implements Language {
	private static final String NAME = "Java";

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public boolean isPlatformDependent() {
		return false;
	}

}
