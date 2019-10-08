package com.orange.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class RemoveDupe {
	static ArrayList<Integer> myList= new ArrayList<>();
	static int[] myArray = {100,0,-1,4,4,100,5,6,3,3,2,2};
	public static void main(String[] args) {
		int arrayLength = myArray.length;
		for (int i = 0; i < arrayLength; i++) {
			myList.add(i,myArray[i]);
		}
		System.out.println(myList); //[10, 20, -20, 10, 30] 
		Collections.sort(myList);    
		System.out.println(myList); //[-20, 10, 10, 20, 30]  0,1,2,3,4
		ArrayList<Integer> myNewList = new ArrayList<>();
		int myListSize = myList.size();
		System.out.println(myListSize);
		for (int i = 0; i < myListSize; i++) {
			if (i == 0) {
				myNewList.add(myList.get(i));
			} else if (myNewList.get(myNewList.size()-1) != myList.get(i)) {
				System.out.println("Adding " + i);
				myNewList.add(myList.get(i));
				System.out.println("myNewList" + myNewList);
			}
		}
	}

}
