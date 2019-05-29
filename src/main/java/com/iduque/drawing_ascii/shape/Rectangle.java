package com.iduque.drawing_ascii.shape;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Rectangle extends Line implements Drawable {

	public Rectangle(int x1, int y1, int x2, int y2) {
		super(x1, y1, x2, y2);
	}

	@Override
	public List<Point> getCoords(Point canvasSize) {
		if (isInsideCanvas(canvasSize.x - 1, canvasSize.y - 1)) {
			List<Point> rectangle = new ArrayList<Point>();
			rectangle.addAll(getCoordsVerLine(y1, y2, x1));
			rectangle.addAll(getCoordsVerLine(y1, y2, x2));
			rectangle.addAll(getCoordsHorLine(x1, x2, y1));
			rectangle.addAll(getCoordsHorLine(x1, x2, y2));
			List<Point> rectangleWithoutDuplicates = rectangle.stream().distinct().collect(Collectors.toList());
			return rectangleWithoutDuplicates;
		}
		return null;

	}

}
