/*
 * ClassName : Variables
 * Version info : 0.1
 * CopyRight : My Practice Use Only
 */
package com.orange.intorduction;



public class DefaultVariableValues {
	
	private static byte mybyteVariable;
	private static short myShortVariable;
	public static int myIntVariable;
	private static long myLongVariable;
	private static float myFloatVariable;
	private static double myDoubleVariable;
	private static char myCharVariable;
	private static boolean myBooleanVariable;
	
	public static void main(String[] args) {
		
		System.out.println("Value of mybyteVariable : " + mybyteVariable);
		oneMoreMethod();		
		System.out.println("Value of myShortVariable : " + myShortVariable);			
		System.out.println("Value of myIntVariable : " + myIntVariable);
		System.out.println("Value of myLongVariable : " + myLongVariable);	
		System.out.println("Value of myFloatVariable : " + myFloatVariable);	
		System.out.println("Value of myDoubleVariable : " + myDoubleVariable);		
		System.out.println("Value of myCharVariable : " + myCharVariable);		
		System.out.println("Value of myBooleanVariable : " + myBooleanVariable);
	}


	  private static void oneMoreMethod() {
	
		System.out.println("Value of mybyteVariable oneMoreMethod: " + mybyteVariable);
			
	}
}

