package com.orange.arrayList;

import java.util.ArrayList;
import java.util.function.Consumer;

public class SamplearrayList {
	static ArrayList<Integer> arrayLst = new ArrayList<>();
	public static void main(String[] args) {
		System.out.println(arrayLst.size());
		System.out.println("My Array at this point is empty Array :"+ arrayLst.isEmpty());
		for (int i = 0; i < 10; i++) {
			arrayLst.add(i, i);
		}
		System.out.println("My Array is not an Empty Array :" + arrayLst.isEmpty());
		int myarraySize = arrayLst.size();
		System.out.println("MyArray Size " + myarraySize);
		arrayLst.forEach((a) -> System.out.print (a + " ")); 
		System.out.println();
		System.out.println("Print using Set " + arrayLst.set(9,10));
		
		for (int i = 0; i < myarraySize; i++) {
			System.out.print(arrayLst.get(i)+ " ");
		}
	}
	
}
