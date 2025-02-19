package com.structuralDesign.bridge;

public class Circle extends Shape {
	public Circle(Colour color) {
		super(color);
	}

	public void draw() {
		System.out.print("Drawing Circle - ");
		color.applyColor();
	}
}
