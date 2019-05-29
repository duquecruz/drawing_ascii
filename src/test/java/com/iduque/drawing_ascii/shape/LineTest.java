package com.iduque.drawing_ascii.shape;

import static org.junit.Assert.assertEquals;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class LineTest {

	@Test
	public void testgetCoordsVerLine() {
		List<Point> line = new ArrayList<Point>();
		line.add(new Point(2, 3));
		line.add(new Point(2, 4));
		line.add(new Point(2, 5));
		line.add(new Point(2, 6));
		Line drawableLine = new Line(2, 3, 2, 6);
		assertEquals(line, drawableLine.getCoords(new Point(20, 20)));
		assertEquals(Integer.valueOf(2), (drawableLine.getX1()));
		assertEquals(Integer.valueOf(3), drawableLine.getY1());
		assertEquals(Integer.valueOf(2), drawableLine.getX2());
		assertEquals(Integer.valueOf(6), drawableLine.getY2());
	}

	@Test
	public void testgetCoordsHorLine() {
		List<Point> line = new ArrayList<Point>();
		line.add(new Point(2, 1));
		line.add(new Point(3, 1));
		line.add(new Point(4, 1));
		line.add(new Point(5, 1));
		Line drawableLine = new Line(2, 1, 5, 1);
		assertEquals(line, drawableLine.getCoords(new Point(20, 20)));
	}

	@Test
	public void testLineOutside() {
		List<Point> line = new ArrayList<Point>();
		line.add(new Point(2, 3));
		line.add(new Point(2, 4));
		line.add(new Point(2, 5));
		line.add(new Point(2, 6));
		Line drawableLine = new Line(2, 3, 2, 6);
		assertEquals(null, drawableLine.getCoords(new Point(2, 4)));
	}

}
