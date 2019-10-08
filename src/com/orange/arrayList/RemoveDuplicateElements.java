package com.orange.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class RemoveDuplicateElements {
	static int[] myArray = {0,-1,4,4,100,5,6,3,3,2,2,0};  //{0,2,4,5,6,3,7,-1} or {-1, 0,2,3,4,5,6,7}
	static boolean duplicate = true;
	public static void main (String[] args) {
		int arraylength = myArray.length;
		//System.out.println(arraylength);
		//Arrays.parallelSort(myArray);
		ArrayList<Integer> myArrayList = new ArrayList<Integer>();
		ArrayList<Integer> myArrayList1 = new ArrayList<Integer>();
		ArrayList<Integer> dupeArrayList = new ArrayList<Integer>();
		for (int i = 0; i <arraylength;i++) {
			myArrayList.add(i,myArray[i]);
		}
		Collections.sort(myArrayList); 
		System.out.println("SORTED Array : " + myArrayList); 
		for (int i = 0; i < arraylength; i++) {  // [-1, 0, 2, 2, 3, 3, 4, 4, 5, 6, 100]
			//System.out.println("Value of I :"+i);
			int k = i+1;
			if (k == arraylength) {
				k = k-1;
				duplicate = false;
			}
			for (int j = k ; j < arraylength; j++) {
				//System.out.println("(I,J) " + i+"," +j );
				if (myArrayList.get(i) != myArrayList.get(j)) {
					myArrayList1.add(myArrayList.get(i));
					//System.out.println("Added to new Array");
					break;
				}else if (myArrayList.get(i) == myArrayList.get(j)) {
					if (! duplicate) {
						myArrayList1.add(myArrayList.get(i));
					}else {
						dupeArrayList.add(myArrayList.get(i));
					}
					break;
				} 
			} 
		}
		System.out.println("Dupe Elements : " + dupeArrayList);
		System.out.println("Removed Dupe Array : " + myArrayList1);
	}
}
