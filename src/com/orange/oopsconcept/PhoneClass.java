package com.orange.oopsconcept;

public class PhoneClass {
	// Encapsulation 
	// Class variable 
	private String phoneModel; 
	private String phoneMake;
	private int phoneCost;
	private boolean phoneLiked;
	
	//setter and getter for phone class variables 
	public String getPhoneModel() {
		return phoneModel;
	}
	public void setPhoneModel(String phoneModel) {
		this.phoneModel = phoneModel;
	}
	public String getPhoneMake() {
		return phoneMake;
	}
	public void setPhoneMake(String phoneMake) {
		this.phoneMake = phoneMake;
	}
	public int getPhoneCost() {
		return phoneCost;
	}
	public void setPhoneCost(int phoneCost) {
		if (phoneCost > 900) {
			this.phoneCost = phoneCost;
		}else {
			System.out.println("Sorry need to pay more");
		}
		
	}
	public boolean getPhoneLiked() {
		return phoneLiked;
	}
	public void setPhoneLiked(boolean phoneLiked) {
		this.phoneLiked = phoneLiked;
	}
}
