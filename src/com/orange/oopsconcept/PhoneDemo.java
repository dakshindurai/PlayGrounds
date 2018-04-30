package com.orange.oopsconcept;

public class PhoneDemo {

	public static void main(String[] args) {
		
		PhoneClass myPhone = new PhoneClass(); // Create and Initialize Object
		PhoneClass myFriendPhone = new PhoneClass(); // Create and Initialize Object
		
	
		myPhone.setPhoneModel("iPhone 6s");
		System.out.println("I have " + myPhone.getPhoneModel());
		myPhone.setPhoneMake("Apple");
		System.out.println("I liked the product from " + myPhone.getPhoneMake());
		myPhone.setPhoneCost(400);
		System.out.println("The cost of Apple Phone which I liked is " + "$" + myPhone.getPhoneCost() );
		myPhone.setPhoneLiked(true);
		System.out.println("Do you recommend the phone to others " + myPhone.getPhoneLiked());
		System.out.println();
		myFriendPhone.setPhoneModel("Samsung s7");
		System.out.println("My Friend have "+myFriendPhone.getPhoneModel());
		myFriendPhone.setPhoneMake("Samsung");
		System.out.println("My Friend Liked the product from " + myFriendPhone.getPhoneMake());
		myFriendPhone.setPhoneCost(600);
		System.out.println("My Friend Phone cost " + "$"+ myFriendPhone.getPhoneCost());
		myFriendPhone.setPhoneLiked(true);
		System.out.println("Does your friend recommend the phone to others " + myFriendPhone.getPhoneLiked());

	}

}
