package com.capgemini.lab6collectionframework;

import java.util.Scanner;

import com.capgemini.lab6collectionframework.model.ReverseSort;

public class ReverseSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		ReverseSort obj=new ReverseSort();
		System.out.print("Enter size of the array : ");
		int size=sc.nextInt();
			int array[]=new int[size];
			for(int i=0;i<size;i++) {
				System.out.print("Enter Element No."+(i+1)+" : ");
				array[i]=sc.nextInt();
			}
			System.out.println("The reversed elements before sorting the array : ");
			for(int i=0;i<size;i++) {
				System.out.print(obj.reverse(array[i])+" ");
			}
			System.out.println();
			System.out.println("The reversed elements after sorting the array : ");
			array=obj.getSorted(array);
			for(int i=0;i<size;i++) {
				System.out.print(array[i]+" ");
			}
		}
}
