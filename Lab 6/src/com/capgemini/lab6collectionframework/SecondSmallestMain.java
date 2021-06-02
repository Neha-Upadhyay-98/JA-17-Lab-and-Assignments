package com.capgemini.lab6collectionframework;

import java.util.Scanner;

import com.capgemini.lab6collectionframework.model.SecondSmallest;

public class SecondSmallestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		SecondSmallest obj=new SecondSmallest();
		System.out.print("Enter the size of the array : ");
		int size=sc.nextInt();
			int array[]=new int[size];
			for(int i=0;i<size;i++) {
				System.out.print("Enter Element No."+(i+1)+" : ");
				array[i]=sc.nextInt();
			}
			System.out.println("The second smallest number in the array is "+obj.getSecondSmallest(array)+".");
		}
}
