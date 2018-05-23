package com.orange.oopsconcept;

public class ParameterizedConstructorDemo {

	public static void main(String[] args) {

		ParameterizedConstructorClass P1 = new ParameterizedConstructorClass("Civic","Hondo", 2008);
		System.out.println(P1.getMyCar());
		System.out.println(P1.getMyCarModel());
		System.out.println(P1.getMyCarYear());

	}
}
