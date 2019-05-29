package com.iduque.drawing_ascii.helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class Helper {
	public static boolean validateImput(String imput) {
		String regex = "([cClLrR])(\\s)(\\d+)(\\s)(\\d+)((\\s)(\\d+)(\\s)(\\d+))?";
		return imput.matches(regex);
	}
	
	public static List<String> getImputAsList(String imput) {
		Scanner scan = new Scanner(imput);
		List<String> returnValue = new ArrayList<String>();
		while (scan.hasNext()) {
			returnValue.add(scan.next());
		}
		scan.close();
		return returnValue;
	}
}
