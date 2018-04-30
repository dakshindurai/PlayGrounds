package com.orange.staticpackage;

public class StaticDemo {

	public static void main(String[] args) {
		StaticClassExample s1 = new StaticClassExample("benz");
		System.out.println(s1.getMake());
		System.out.println(StaticClassExample.getInstanceNum());
		
		StaticClassExample s2 = new StaticClassExample("bmw");
		System.out.println(s2.getMake());
		System.out.println(StaticClassExample.getInstanceNum());
	}
}
