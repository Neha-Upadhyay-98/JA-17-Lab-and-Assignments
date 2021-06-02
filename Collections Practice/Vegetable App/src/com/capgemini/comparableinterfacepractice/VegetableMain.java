package com.capgemini.comparableinterfacepractice;

import java.util.ArrayList;
import java.util.Scanner;

import com.capgemini.comparableinterfacepractice.model.Vegetable;
import com.capgemini.comparableinterfacepractice.service.VegetableManager;

public class VegetableMain {
	static Scanner sc=new Scanner(System.in);
	private static int vegId;
	private static String vegName;
	private static double vegPrice;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VegetableManager vm=new VegetableManager();
		ArrayList<Vegetable> vegList=new ArrayList<Vegetable>();
		char choice='y';
		while(choice=='y'){
			System.out.println("Enter the choice");
			System.out.println("c : create vegetable list");
			System.out.println("r : read vegetable list");
			System.out.println("u : update vegetable list");
			System.out.println("d : delete an item from vegetable list");
			System.out.println("s : sort vegetable list");
			System.out.println("i : sort vegetable list using vegetable id");
			System.out.println("n: sort vegetable list using vegetable name");
			System.out.println("p: sort vegetable list using vegetable price");
			char ch=sc.next().charAt(0);
		switch(ch){
		case 'c':
			readDetails();
			vegList=vm.createVegetable(vegId, vegName, vegPrice);
			break;
		case 'r':
			vm.readVegetableList(vegList);
			break;
		case 'u':
			vm.updateVegetableList(vegList);
			break;
		case 'd':
			vm.deleteItemFromList(vegList);
			break;
		case 's':
			vm.sortVegList(vegList);
			break;
		case 'i':
			vm.sortVegListUsingID(vegList);
			break;
		case 'n':
			vm.sortVegListUsingName(vegList);
			break;
		case 'p':
			vm.sortVegListUsingPrice(vegList);
			break;
		default:
			break;
		}//switch close
		System.out.println("Do you want to continue? (y/n)");
		choice=sc.next().charAt(0);
		}//while close
	}
	
	public static void readDetails(){
		System.out.println("Enter the vegetable details:");
		System.out.println("Enter the vegetable id:");
		vegId=sc.nextInt();
		System.out.println("Enter the vegetable name :");
		vegName=sc.next();
		System.out.println("Enter the price of the vegetable :");
		vegPrice=sc.nextDouble();
	}
}
