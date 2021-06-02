package com.capgemini.lab6collectionframework.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class VotersList {

	public List<Integer> votersList(Map<Integer,Integer> voter){
		List<Integer> list=new ArrayList<Integer>();
		for(Map.Entry<Integer, Integer> m : voter.entrySet()) {
			if(m.getValue()>=18) {
				list.add(m.getKey());
			}
		}
		return list;
	}
}
