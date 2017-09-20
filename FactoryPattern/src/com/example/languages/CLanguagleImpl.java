package com.example.languages;

public class CLanguagleImpl implements Language {
	private static final String NAME = "C";

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public boolean isPlatformDependent() {
		return true;
	}

}
