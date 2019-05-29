package com.iduque.drawing_ascii;

import java.awt.Point;
import java.util.List;
import java.util.Scanner;

import com.iduque.drawing_ascii.factory.DrawingFactory;
import com.iduque.drawing_ascii.helper.Helper;
import com.iduque.drawing_ascii.shape.Canvas;
import com.iduque.drawing_ascii.shape.Drawable;

public class App {

	public static void main(String[] args) {
		System.out.println("Application Starting!!");
		Scanner input = new Scanner(System.in);
		String response = "";
		DrawingFactory factory = new DrawingFactory();
		Canvas canvas = null;

		while (!response.equalsIgnoreCase("Q")) {

			System.out.print("Enter Command: ");
			response = input.nextLine();

			if (Helper.validateImput(response)) {
				List<String> command = Helper.getImputAsList(response);
				Drawable printableObject = factory.getDrawingObject(command);

				if (printableObject.getClass().equals(Canvas.class)) {
					canvas = (Canvas) printableObject;
				} else {
					if (canvas != null) {
						Point canvasSize = new Point(canvas.getX(), canvas.getY());
						List<Point> printableObjectCoords = printableObject.getCoords(canvasSize);
						if (printableObjectCoords != null) {
							canvas.addToCanvas(printableObject.getCoords(canvasSize));
						} else {
							System.out.println("ERROR: The object is not valid!!");
						}

					} else {
						System.out.println("ERROR: You need to create the Canvas first!!");
					}
				}

				if (canvas != null) {
					canvas.draw();
				}

			} else {
				if (!response.equalsIgnoreCase("Q")) {
					System.out.println("This is not a valid imput, please try again");
				}
			}

		}
		input.close();
		System.out.println("Thank you for drawing with this App");

	}

}
