package com.orange.conditionalflow;

public class DoWhileDemo {
	//steps are executed first and validated for condition
	public static void main(String[] args) {
		int i = 10;
		System.out.println("Start");
		do {
			System.out.println(i);
		}while (i < 10);
		System.out.println();
		System.out.println("End");
	}

}
