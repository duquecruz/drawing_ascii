package com.iduque.drawing_ascii.shape;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CanvasTest {

	@Test
	public void testCanvas() {
		Point point = new Point(25, 20);
		List<Point> canvasCoords = new ArrayList<Point>();
		canvasCoords.add(point);
		Canvas canvas = new Canvas(25, 20);
		assertEquals(26, canvas.getX());
		assertEquals(21, canvas.getY());
		assertNotNull(canvas.getDrawableObjects());
		assertEquals(canvasCoords, canvas.getCoords(point));
	}

}
