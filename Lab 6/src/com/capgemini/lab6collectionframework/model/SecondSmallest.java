package com.capgemini.lab6collectionframework.model;

import java.util.ArrayList;
import java.util.Collections;

public class SecondSmallest {
	
	public int getSecondSmallest(int[] array) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for(int i=0;i<array.length;i++) {
			arrayList.add(array[i]);
		}
		Collections.sort(arrayList);
		int secondSmallest=arrayList.get(1);
		for(int i=1;i<array.length;i++) {
			if(arrayList.get(i)!=arrayList.get(i-1))
			{
				secondSmallest=arrayList.get(i);
				break;
			}
		}
		return secondSmallest;
	}

}
