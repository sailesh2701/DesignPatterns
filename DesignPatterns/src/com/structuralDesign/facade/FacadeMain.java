package com.structuralDesign.facade;

public class FacadeMain {

	public static void main(String[] args) {

		/**
		 * 
		 * We will call only Smart House to watch movie that will call all the methods
		 * related to light, AC, music etc to On or Off
		 * 
		 **/

		SmartHouse sh = new SmartHouse();
		sh.watchMovie();
		sh.stopMovie();
	}

}
