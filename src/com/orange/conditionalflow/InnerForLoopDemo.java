package com.orange.conditionalflow;

public class InnerForLoopDemo {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println("The Value of I and corresponding J is : "+ i +","+ j);
			}
		}
	}

}
