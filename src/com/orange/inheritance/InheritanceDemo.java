package com.orange.inheritance;

import com.orange.automobile.BMW;
import com.orange.automobile.Cars;
import com.orange.automobile.AccessVariables;

public class InheritanceDemo extends AccessVariables{

	public static void main(String[] args) {
		int speed = 35;

		Cars c1 = new Cars(speed);
		c1.increaseSpeed();
		c1.decreaseSpeed();
		
		System.out.println();		
		
		BMW b1 = new BMW(speed);
		b1.increaseSpeed();
		b1.headsUpdisplayNavigation();
		b1.eaglesEye();
		AccessVariables av1 = new AccessVariables();
		protectedDollarValue = 10;
		av1.publicDollarValue = 100;
		av1.protectedDollarValue = 5;
		
		
	}

}
