package com.capgemini.lab6collectionframework.model;

import java.util.HashMap;
import java.util.Map;

public class GetSquares {
	
	public Map<Integer,Integer> getSquares(int[] array){
		
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<array.length;i++){
			map.put(array[i], array[i]*array[i]);
		}
		return map;
	}

}
