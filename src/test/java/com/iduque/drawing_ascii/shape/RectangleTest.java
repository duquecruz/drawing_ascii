package com.iduque.drawing_ascii.shape;

import static org.junit.Assert.assertEquals;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class RectangleTest {

	@Test
	public void testgetCoordsRectangle() {
		List<Point> rectangle = new ArrayList<Point>();
		rectangle.add(new Point(3, 5));
		rectangle.add(new Point(3, 6));
		rectangle.add(new Point(3, 7));
		rectangle.add(new Point(5, 5));
		rectangle.add(new Point(5, 6));
		rectangle.add(new Point(5, 7));
		rectangle.add(new Point(4, 5));
		rectangle.add(new Point(4, 7));
		Rectangle drawableRectangle = new Rectangle(3, 5, 5, 7);
		assertEquals(rectangle, drawableRectangle.getCoords(new Point(20, 20)));
		assertEquals(Integer.valueOf(3), drawableRectangle.getX1());
		assertEquals(Integer.valueOf(5), drawableRectangle.getY1());
		assertEquals(Integer.valueOf(5), drawableRectangle.getX2());
		assertEquals(Integer.valueOf(7), drawableRectangle.getY2());
	}

	@Test
	public void testgetCoordsOutsideCanvas() {
		List<Point> rectangle = new ArrayList<Point>();
		rectangle.add(new Point(3, 5));
		rectangle.add(new Point(3, 6));
		rectangle.add(new Point(3, 7));
		rectangle.add(new Point(5, 5));
		rectangle.add(new Point(5, 6));
		rectangle.add(new Point(5, 7));
		rectangle.add(new Point(4, 5));
		rectangle.add(new Point(4, 7));
		Rectangle drawableRectangle = new Rectangle(3, 5, 5, 7);
		assertEquals(null, drawableRectangle.getCoords(new Point(2, 2)));
	}
}
