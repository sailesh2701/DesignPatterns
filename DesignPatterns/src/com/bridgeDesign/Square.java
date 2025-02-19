package com.bridgeDesign;

public class Square extends Shape {
	public Square(Colour color) {
		super(color);
	}

	public void draw() {
		System.out.print("Drawing Square - ");
		color.applyColor();
	}
}
