package com.orange.oopsconcept;

public class ComputerClass {
	
	private String computerModel; 
	private String computerMake;
	private int computerCost;
	
	public ComputerClass() {
		System.out.println("Default Constructor");
	}
	public String getComputerModel() {
		return computerModel;
	}
	public void setComputerModel(String computerModel) {
		this.computerModel = computerModel;
	}
	public String getComputerMake() {
		return computerMake;
	}
	public void setComputerMake(String computerMake) {
		this.computerMake = computerMake;
	}
	public int getComputerCost() {
		return computerCost;
	}
	public void setComputerCost(int computerCost) {
		this.computerCost = computerCost;
	}
	
	
	
}
