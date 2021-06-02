package com.capgemini.lab6collectionframework.model;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseSort {

	public int reverse(int number) {
		String string=""+number;
		String rev="";
		for(int i=string.length()-1;i>=0;i--) {
			rev+=string.charAt(i);
		}
		return Integer.parseInt(rev);
	}
	
	public int[] getSorted(int[] array) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for(int i=0;i<array.length;i++) {
			array[i]=reverse(array[i]);
			arrayList.add(array[i]);
		}
		Collections.sort(arrayList);
		for(int i=0;i<array.length;i++) {
			array[i]=arrayList.get(i);
		}
		return array;
	}

}
