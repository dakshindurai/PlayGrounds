package com.orange.automobile;

public class BMW extends Cars{
	
	public BMW(int startSpeed) {
		super(startSpeed);
		System.out.println("Speed of BMW Cars "+startSpeed);
	}

	@Override
	public void increaseSpeed() {
		// TODO Auto-generated method stub
		super.decreaseSpeed();
	}

	@Override
	public void decreaseSpeed() {
		// TODO Auto-generated method stub
		super.decreaseSpeed();
	}
	public void headsUpdisplayNavigation() {
		System.out.println("BMW Specific functionality ");
	}
}
