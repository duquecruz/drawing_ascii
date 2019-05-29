package com.iduque.drawing_ascii.shape;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Line extends DrawableObject implements Drawable {

	public Line(int x1, int y1, int x2, int y2) {
		super(x1, y1, x2, y2);
	}

	public List<Point> getCoords(Point canvasSize) {
		if (isInsideCanvas(canvasSize.x-1, canvasSize.y-1)) {
			if (x1 == x2) {
				return getCoordsVerLine(y1, y2, x1);
			} else if (y1 == y2) {
				return getCoordsHorLine(x1, x2, y1);
			}
		}
		return null;

	}

	public List<Point> getCoordsHorLine(int a, int b, int c) {
		List<Point> line = new ArrayList<Point>();
		int i = a;
		while (i <= b) {
			Point point = new Point(i, c);
			line.add(point);
			i++;
		}
		return line;
	}

	public List<Point> getCoordsVerLine(int a, int b, int c) {
		List<Point> line = new ArrayList<Point>();
		int i = a;
		while (i <= b) {
			Point point = new Point(c, i);
			line.add(point);
			i++;
		}
		return line;
	}

}
