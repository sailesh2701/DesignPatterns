package com.bridgeDesign;

abstract class Shape {
	protected Colour color; // Bridge to Color

	public Shape(Colour color) {
		this.color = color;
	}

	abstract void draw();
}
