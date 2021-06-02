package com.capgemini.comparableinterfacepractice.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import com.capgemini.comparableinterfacepractice.model.Vegetable;

public class VegetableManager {

	Scanner sc=new Scanner(System.in);
	ArrayList<Vegetable> vegList=new ArrayList<Vegetable>();
	
	//create list
	public ArrayList<Vegetable> createVegetable(int vid,String vname,double vprice){
		Vegetable v=new Vegetable(vid,vname,vprice);
		vegList.add(v);
		return vegList;
	}
	
	//read list
	public void readVegetableList(ArrayList<Vegetable> vegList){
		for(Vegetable v1:vegList){
			System.out.println(v1.getVegId()+"\t\t\t"+v1.getVegName()+"\t\t\t"+v1.getVegPrice());
		}
	}
	
	//update list
	public void updateVegetableList(ArrayList<Vegetable> vegList){
		System.out.println("Enter the vegetable id that you want to update : ");
		int vUid=sc.nextInt();
		for(Vegetable v2:vegList) {
			if(v2.getVegId()==vUid) {
				System.out.println("Enter new vegetable name");
				String newVname= sc.next();
				System.out.println("Enter new vegetable price");
				double newVprice=sc.nextDouble();
				v2.setVegName(newVname);
				v2.setVegPrice(newVprice);
			}
		}
	}
	//sort list
	public void sortVegList(ArrayList<Vegetable> vegList){
		Collections.sort(vegList);
		System.out.println("***************************");
		System.out.println("Sorted vegetable list ");
		System.out.println("***************************");
		for(Vegetable v4:vegList){
			System.out.println(v4.getVegId()+"\t\t\t"+v4.getVegName()+"\t\t\t"+v4.getVegPrice());
		}
	}
	
	//sorting list using vegetable name
	public void sortVegListUsingName(ArrayList<Vegetable> vegList){
		Collections.sort(vegList, new VegetableNameComparator());
		System.out.println("***************************");
		System.out.println("Sorted vegetable list using name :");
		System.out.println("***************************");
		for(Vegetable v4:vegList){
			System.out.println(v4.getVegId()+"\t\t\t"+v4.getVegName()+"\t\t\t"+v4.getVegPrice());
		}
	}
	
	//sorting list using vegetable id
	public void sortVegListUsingID(ArrayList<Vegetable> vegList){
		Collections.sort(vegList, new VegetableIDComparator());
		System.out.println("***************************");
		System.out.println("Sorted vegetable list ");
		System.out.println("***************************");
		for(Vegetable v4:vegList){
			System.out.println(v4.getVegId()+"\t\t\t"+v4.getVegName()+"\t\t\t"+v4.getVegPrice());
		}
	}
	
	//sorting list using vegetable price
	public void sortVegListUsingPrice(ArrayList<Vegetable> vegList){
		Collections.sort(vegList, new VegetablePriceComparator());
		System.out.println("***************************");
		System.out.println("Sorted vegetable list ");
		System.out.println("***************************");
		for(Vegetable v4:vegList){
			System.out.println(v4.getVegId()+"\t\t\t"+v4.getVegName()+"\t\t\t"+v4.getVegPrice());
		}
	}
	//delete a vegetable from list
	public void deleteItemFromList(ArrayList<Vegetable> vegList){
		System.out.println("Enter the vegetable id that you want to delete : ");
		int vDid=sc.nextInt();
		Iterator<Vegetable> vegItr = vegList.iterator();
		while(vegItr.hasNext()) {
			Vegetable v3 = vegItr.next();
			if(v3.getVegId()==vDid) {
				vegItr.remove();
			}
		}
	}
	
	public ArrayList<Vegetable> getList(){
		return vegList;
	}
}