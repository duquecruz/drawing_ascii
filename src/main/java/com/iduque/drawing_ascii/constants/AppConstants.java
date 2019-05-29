package com.iduque.drawing_ascii.constants;

public enum AppConstants {
	EMPTY(" "), 
	HYPHEN("-"), 
	VERTICALBAR("|"),
	XCHAR("X");

	public final String value;

	private AppConstants(String value) {
		this.value = value;
	}

}
