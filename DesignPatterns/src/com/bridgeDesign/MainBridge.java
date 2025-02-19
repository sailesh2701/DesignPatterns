package com.bridgeDesign;

//Structural
public class MainBridge {

	public static void main(String[] args) {
		Shape redCircle = new Circle(new Red());
		redCircle.draw(); // Output: Drawing Circle - Applying Red color

		Shape blueSquare = new Square(new Blue());
		blueSquare.draw(); // Output: Drawing Square - Applying Blue color
	}

}
