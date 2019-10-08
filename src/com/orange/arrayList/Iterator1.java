package com.orange.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {

	public static void main(String[] args) {
		ArrayList<String> myStringList = new ArrayList<>();
		myStringList.add("Greek");
		myStringList.add("Hello");
		myStringList.add("Test");
		myStringList.add("");
		Iterator<String> iterate = myStringList.iterator();
		while (iterate.hasNext()) {
			System.out.println(iterate.next());
		}
//		System.out.println(myStringList);
//		String[] myStringArray = {"Greeks", "Hello","Test"};
//		System.out.println(myStringArray);
		
	}

}
