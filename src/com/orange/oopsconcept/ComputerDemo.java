package com.orange.oopsconcept;

public class ComputerDemo {
	
	public static void main(String[] args) {
		ComputerClass myComputer = new ComputerClass(); // Create and Initialize Object
		ComputerClass myFriendComputer = new ComputerClass(); // Create and Initialize Object
		
		myComputer.setComputerMake("Apple");
		myComputer.setComputerModel("Macbook Pro");
		myComputer.setComputerCost(1800);
		
		myFriendComputer.setComputerMake("SamSung");
		myFriendComputer.setComputerModel("iTouch");
		myFriendComputer.setComputerCost(1500);
		System.out.println("");
		System.out.println("My Computer is " + myComputer.getComputerMake());
		System.out.println("My Friend's Computer is " + myFriendComputer.getComputerMake());

	}

}

