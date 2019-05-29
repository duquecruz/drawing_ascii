package com.iduque.drawing_ascii.factory;

import java.util.List;

import com.iduque.drawing_ascii.constants.DrawableObjects;
import com.iduque.drawing_ascii.shape.Canvas;
import com.iduque.drawing_ascii.shape.Drawable;
import com.iduque.drawing_ascii.shape.Line;
import com.iduque.drawing_ascii.shape.Rectangle;

public class DrawingFactory {
	public Drawable getDrawingObject(List<String> command) {

		int x1 = 0;
		int y1 = 0;
		int x2 = 0;
		int y2 = 0;

		String objectType = command.get(0);
		x1 = Integer.parseInt(command.get(1));
		y1 = Integer.parseInt(command.get(2));
		if (command.size() > 3) {
			x2 = Integer.parseInt(command.get(3));
			y2 = Integer.parseInt(command.get(4));
		}

		if (objectType.equalsIgnoreCase(DrawableObjects.CANVAS.value)) {
			return new Canvas(x1, y1);
		}
		if (objectType.equalsIgnoreCase(DrawableObjects.LINE.value)) {
			return new Line(x1, y1, x2, y2);
		}
		if (objectType.equalsIgnoreCase(DrawableObjects.RECTANGLE.value)) {
			return new Rectangle(x1, y1, x2, y2);
		}
		return null;

	}
}
