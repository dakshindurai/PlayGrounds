package com.orange.inheritance;

import com.orange.automobile.BMW;
import com.orange.automobile.Cars;

public class InheritanceDemo {

	public static void main(String[] args) {
		int speed = 35;
		Cars c1 = new Cars(speed);
		c1.increaseSpeed();
		c1.decreaseSpeed();
		c1.eaglesEye();
		
		BMW b1 = new BMW(speed);
		b1.increaseSpeed();
		b1.headsUpdisplayNavigation();
		b1.eaglesEye();
	}

}
