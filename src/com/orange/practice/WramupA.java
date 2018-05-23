package com.orange.practice;
/*
 * The parameter weekday is true if it is a weekday, 
 * and the parameter vacation is true if we are on vacation. 
 * We sleep in if it is not a weekday or we're on vacation. 
 * Return true if we sleep in.
 */
public class WramupA {
	static boolean weekday = true;
	static boolean vacation;
	static boolean result;
	public static void main(String[] args) {
		System.out.println(result = sleepIn(weekday, vacation));
		}
	public static boolean sleepIn(boolean weekday, boolean vacation) {
		System.out.println(weekday);
		System.out.println(vacation);
		
		if (!weekday || vacation) {
			return true;
		}
		return false;
	}
}
	
	

