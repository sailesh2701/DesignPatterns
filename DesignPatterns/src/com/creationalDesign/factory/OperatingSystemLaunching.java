package com.creationalDesign.factory;

public class OperatingSystemLaunching {

	public Os getInstance(String s) {
		if (s.equalsIgnoreCase("Open"))
			return new AndriodOs();
		else if (s.equalsIgnoreCase("Closed"))
			return new Ios();

		return new WindowsOs();
	}

}
