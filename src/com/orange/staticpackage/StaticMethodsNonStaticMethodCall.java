package com.orange.staticpackage;

public class StaticMethodsNonStaticMethodCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethodsNonStaticMethodCall s1 = new StaticMethodsNonStaticMethodCall();
		s1.nonStaticMethod();
	}
	public void nonStaticMethod() {
		System.out.println("Hello");
	}
}
