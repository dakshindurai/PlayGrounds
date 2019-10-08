package com.orange.automobile;

public class AccessModifiers {

	public static void main(String[] args) {
		
		AccessVariables av1 = new AccessVariables();
		av1.dollarValue = 10;
		av1.setPrivateDollarValue(11);
		System.out.println(av1.getPrivateDollarValue());
		av1.protectedDollarValue = 10;
		
	}

}
