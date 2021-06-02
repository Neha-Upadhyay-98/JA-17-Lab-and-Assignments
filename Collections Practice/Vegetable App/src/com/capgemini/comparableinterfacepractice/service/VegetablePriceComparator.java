package com.capgemini.comparableinterfacepractice.service;

import java.util.Comparator;

import com.capgemini.comparableinterfacepractice.model.Vegetable;

public class VegetablePriceComparator implements Comparator<Vegetable> {

	@Override
	public int compare(Vegetable veg1, Vegetable veg2) {
		// TODO Auto-generated method stub
		if(veg1.getVegPrice()==veg2.getVegPrice())
			return 0;
		else if(veg1.getVegPrice()>veg2.getVegPrice())
			return 1;
		else
			return -1;
	}

}
