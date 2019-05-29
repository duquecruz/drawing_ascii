package com.iduque.drawing_ascii.constants;

public enum DrawableObjects {
	LINE("L"),
	RECTANGLE("R"),
	CANVAS("C");
	
	public final String value;

	private DrawableObjects(String value) {
		this.value = value;
	}

}
