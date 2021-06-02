package com.capgemini.lab6collectionframework.model;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
	
	public int countFrequency(char[] array,char k){
		
		int count=0;
		for(int i=0;i<array.length;i++){
			if(array[i]==k)
				count++;
		}
		return count;
	}
	
	public Map<Character, Integer> countCharacter(char[] array){
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i]!=array[j]){
					map.put(array[i], countFrequency(array, array[i]));
				}
			}
			map.put(array[array.length-1], countFrequency(array,array[array.length-1]));
		}
		return map;
	}

}
