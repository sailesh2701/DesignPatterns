package com.structuralDesign.bridge;

//Structural
public class MainBridge {
	/**
	 * The Bridge Pattern is a structural design pattern that helps separate
	 * abstraction from implementation, allowing them to evolve independently.
	 * 
	 * Instead of having a single class with multiple variations, we use composition
	 * to delegate work to different implementations, making the code more flexible
	 * and scalable.
	 **/
	public static void main(String[] args) {
		Shape redCircle = new Circle(new Red());
		redCircle.draw(); // Output: Drawing Circle - Applying Red color

		Shape blueSquare = new Square(new Blue());
		blueSquare.draw(); // Output: Drawing Square - Applying Blue color
	}

}
