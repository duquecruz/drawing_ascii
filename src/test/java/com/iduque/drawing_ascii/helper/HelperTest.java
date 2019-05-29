package com.iduque.drawing_ascii.helper;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class HelperTest {

	@Test
	public void testValidImput1() {
		assertEquals(true, Helper.validateImput("C 2 2"));
	}

	@Test
	public void testValidImput2() {
		assertEquals(true, Helper.validateImput("L 33 44"));
	}

	@Test
	public void testValidImput3() {
		assertEquals(true, Helper.validateImput("r 1 4"));
	}

	@Test
	public void testInvalidImput1() {
		assertEquals(false, Helper.validateImput("K 1 4"));
	}

	@Test
	public void testInvalidImput2() {
		assertEquals(false, Helper.validateImput("C 1.1 4"));
	}

	@Test
	public void testInvalidImput3() {
		assertEquals(false, Helper.validateImput("C 1 4.1"));
	}
	
	@Test
	public void testValidnumberOfParameters1() {
		assertEquals(true, Helper.validateImput("C 1 4 5 6"));
	}
	
	@Test
	public void testInvalidnumberOfParameters1() {
		assertEquals(false, Helper.validateImput("C 1 4 5 6 7"));
	}
	
	@Test
	public void testImputAsList1() {
		List<String> command = new ArrayList<String>();
		command.add("C");
		command.add("1");
		command.add("4");
		assertEquals(command, Helper.getImputAsList("C 1 4"));
	}
	
	@Test
	public void testImputAsList2() {
		List<String> command = new ArrayList<String>();
		command.add("C");
		command.add("13");
		command.add("41");
		command.add("12");
		command.add("12");
		assertEquals(command, Helper.getImputAsList("C 13 41 12 12"));
	}
	
	
	

}
