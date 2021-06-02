package com.capgemini.lab6collectionframework;

import java.util.Map;
import java.util.Scanner;

import com.capgemini.lab6collectionframework.model.GetSquares;

public class GetSquaresMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		GetSquares obj=new GetSquares();
		System.out.println("Enter size of array :");
		int size=sc.nextInt();
		int array[]=new int[size];
		for(int i=0;i<size;i++){
			System.out.print("Enter element at "+(i+1)+" : ");
			array[i]=sc.nextInt();
		}
		Map<Integer,Integer> map=obj.getSquares(array);
		System.out.println("The numbers along with their squares are :");
		for(Map.Entry<Integer, Integer> m : map.entrySet()){
			System.out.println("Number : "+m.getKey()+", Square of "+m.getKey()+" : "+m.getValue());
		}
	}

}
