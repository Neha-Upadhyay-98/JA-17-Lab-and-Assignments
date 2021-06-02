package com.capgemini.lab6collectionframework.model;

import java.util.HashMap;
import java.util.Map;

public class Students {
	
	public  HashMap<Integer,String> getStudents(HashMap<Integer,Integer> hashmap){
		HashMap<Integer,String> output = new HashMap<>();
		for(Map.Entry<Integer,Integer> m : hashmap.entrySet()) {
			if(m.getValue()>=90)
			{
				output.put(m.getKey(),"Gold");
			}
			else if(m.getValue()>=80 && m.getValue()<90)
			{
				output.put(m.getKey(),"Silver");
			}
			else if(m.getValue()>=70 && m.getValue()<80)
			{
				output.put(m.getKey(),"Bronze");
			}
		}
		
		return output;
	}

}
