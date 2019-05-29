package com.iduque.drawing_ascii.shape;

import java.awt.Point;
import java.util.List;

public interface Drawable {
	public List<Point> getCoords(Point canvasSize);
}
