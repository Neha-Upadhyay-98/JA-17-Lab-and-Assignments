package com.capgemini.lab6collectionframework.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapToSortedList {
	
	public List getValues(HashMap<Character,Integer> hashmap){
		
		List<Map.Entry<Character, Integer>> list=new ArrayList<>(hashmap.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Character,Integer>>() { 
			public int compare(Map.Entry<Character, Integer> m1, Map.Entry<Character, Integer>m2) {
				return m1.getValue() -m2.getValue();
			}
		});
		return list;
	}

}
