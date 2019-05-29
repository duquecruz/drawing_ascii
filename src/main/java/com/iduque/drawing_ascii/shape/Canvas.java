package com.iduque.drawing_ascii.shape;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import com.iduque.drawing_ascii.constants.AppConstants;

public class Canvas implements Drawable {

	private int x;
	private int y;
	private Character[][] drawableObjects;

	public Canvas(int x, int y) {
		this.x = x + 1;
		this.y = y + 1;
		this.drawableObjects = initializeCanvas(x + 1, y + 1);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Character[][] getDrawableObjects() {
		return drawableObjects;
	}

	private static Character[][] initializeCanvas(int x, int y) {
		Character[][] canvas = new Character[x][y];
		for (int i = 0; i <= x - 1; i++) {
			for (int j = 0; j <= y - 1; j++) {
				canvas[i][j] = AppConstants.EMPTY.value.charAt(0);
			}
		}
		return canvas;
	}

	public void draw() {
		for (int j = 0; j <= this.y; j++) {
			for (int i = 0; i <= this.x; i++) {
				if (j == 0 || j == this.y) {
					if (i == this.x) {
						System.out.println(AppConstants.HYPHEN.value);
					} else {
						System.out.print(AppConstants.HYPHEN.value);
					}
				} else {
					if (i == 0 || i == this.x) {
						if (i == this.x) {
							System.out.println(AppConstants.VERTICALBAR.value);
						} else {
							System.out.print(AppConstants.VERTICALBAR.value);
						}
					} else {
						if (!AppConstants.EMPTY.value.equalsIgnoreCase(drawableObjects[i][j].toString())) {
							System.out.print(AppConstants.XCHAR.value);
						} else {
							System.out.print(AppConstants.EMPTY.value);
						}

					}

				}
			}
		}

	}

	public List<Point> getCoords(Point canvasSize) {
		List<Point> canvasCoords = new ArrayList<Point>();
		canvasCoords.add(canvasSize);
		return canvasCoords;
	}

	public void addToCanvas(List<Point> drawableObject) {
		for (Point point : drawableObject) {
			drawableObjects[point.x][point.y] = 'X';
		}
	}

}
