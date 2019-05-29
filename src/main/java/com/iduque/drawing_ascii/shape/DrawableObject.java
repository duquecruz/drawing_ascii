package com.iduque.drawing_ascii.shape;

public abstract class DrawableObject {

	protected Integer x1;
	protected Integer y1;
	protected Integer x2;
	protected Integer y2;

	public DrawableObject(Integer x1, Integer y1, Integer x2, Integer y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public Integer getX1() {
		return x1;
	}

	public Integer getY1() {
		return y1;
	}

	public Integer getX2() {
		return x2;
	}

	public Integer getY2() {
		return y2;
	}

	public boolean isInsideCanvas(Integer x, Integer y) {
		if (this.x1 != 0 &&
			this.x2 != 0 &&
			this.y1 != 0 &&
			this.y2 != 0 &&
			this.x1 <= x &&
			this.x2 <= x &&
			this.y1 <= y &&
			this.y2 <= y) {
			return true;
		}
		return false;
	}

}
