package com.orange.conditionalflow;

public class WhileDemo {
	//Conditions are validated first and the steps are executed
	public static void main(String[] args) {
		int i = 10;
		System.out.println("Start");
		while (i < 10) {
			System.out.println(i);
			if (i == 15) {
				System.out.println("Value of I is 15");
				break;
			}
			i++;
		}
		System.out.println();
		System.out.println("End");
	}

}
