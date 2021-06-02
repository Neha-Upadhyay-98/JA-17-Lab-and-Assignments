package com.capgemini.comparableinterfacepractice.service;

import java.util.Comparator;

import com.capgemini.comparableinterfacepractice.model.Vegetable;

public class VegetableIDComparator implements Comparator<Vegetable> {

	@Override
	public int compare(Vegetable veg1, Vegetable veg2) {
		// TODO Auto-generated method stub
		if(veg1.getVegId()==veg2.getVegId())
			return 0;
		else if(veg1.getVegId()>veg2.getVegId())
			return 1;
		else
			return -1;
	}

}
