package com.orange.automobile;

public class Cars {
	int speed;
	
	//Constructor 
	public Cars(int startSpeed){
		speed = startSpeed;
		System.out.println("default constructor from cars class "+ speed);
	}
	
	public void increaseSpeed() {
		speed ++;
		System.out.println("Increasing Cars Speed ...");
		System.out.println("Increased Speed of Cars "+ speed);
	}
	public void decreaseSpeed() {
		speed --;
		System.out.println("Decreasing Cars Speed ...");
		System.out.println("Decreased Speed of Cars "+ speed);
	}
	
	public void eaglesEye() {
		System.out.println("Specific functionality for cars");
	}

}
