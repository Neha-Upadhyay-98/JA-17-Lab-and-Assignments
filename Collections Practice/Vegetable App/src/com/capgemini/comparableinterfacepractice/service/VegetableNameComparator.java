package com.capgemini.comparableinterfacepractice.service;

import java.util.Comparator;

import com.capgemini.comparableinterfacepractice.model.Vegetable;

public class VegetableNameComparator implements Comparator<Vegetable>{

	@Override
	public int compare(Vegetable veg1, Vegetable veg2) {
		// TODO Auto-generated method stub
		return veg1.getVegName().compareTo(veg2.getVegName());
	}

}
