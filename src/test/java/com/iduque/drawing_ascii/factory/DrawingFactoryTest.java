package com.iduque.drawing_ascii.factory;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.iduque.drawing_ascii.shape.Canvas;
import com.iduque.drawing_ascii.shape.Line;
import com.iduque.drawing_ascii.shape.Rectangle;

public class DrawingFactoryTest {

	DrawingFactory factory = new DrawingFactory();

	@Test
	public void testCanvas() {
		List<String> command = new ArrayList<String>();
		command.add("C");
		command.add("10");
		command.add("10");
		assertEquals(Canvas.class, factory.getDrawingObject(command).getClass());
	}

	@Test
	public void test() {
		List<String> command = new ArrayList<String>();
		command.add("R");
		command.add("10");
		command.add("10");
		command.add("20");
		command.add("20");
		assertEquals(Rectangle.class, factory.getDrawingObject(command).getClass());
	}

	@Test
	public void testLine() {
		List<String> command = new ArrayList<String>();
		command.add("l");
		command.add("10");
		command.add("10");
		command.add("20");
		command.add("20");
		assertEquals(Line.class, factory.getDrawingObject(command).getClass());
	}

	@Test
	public void testCanvasMoreCoordinates() {
		List<String> command = new ArrayList<String>();
		command.add("c");
		command.add("10");
		command.add("10");
		command.add("20");
		command.add("20");
		assertEquals(Canvas.class, factory.getDrawingObject(command).getClass());
	}

	@Test(expected = NullPointerException.class)
	public void testErrorClass() {
		List<String> command = new ArrayList<String>();
		command.add("G");
		command.add("10");
		command.add("10");
		command.add("20");
		command.add("20");
		assertEquals(null, factory.getDrawingObject(command).getClass());
	}

	@Test
	public void testErrornumberParameters() {
		List<String> command = new ArrayList<String>();
		command.add("C");
		command.add("10");
		command.add("10");
		command.add("20");
		command.add("20");
		command.add("20");
		assertEquals(Canvas.class, factory.getDrawingObject(command).getClass());
	}

}
