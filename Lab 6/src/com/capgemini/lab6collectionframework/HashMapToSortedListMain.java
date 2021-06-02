package com.capgemini.lab6collectionframework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.capgemini.lab6collectionframework.model.HashMapToSortedList;

public class HashMapToSortedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		HashMapToSortedList obj=new HashMapToSortedList();
		int choice;
		char ch=' ';
		HashMap<Character,Integer> hashmap=new HashMap<>();
		System.out.println("Enter the size of HashMap :");
		char c;
		int size=sc.nextInt();
		if(size<1)
			System.out.println("Size should be 1 or more");
		else{
			for(int i=0;i<size;i++){
				System.out.println("Enter key :"+(i+1));
				c=sc.next().charAt(0);
				hashmap.put(c, (int)c);
			}
			List<Map.Entry<Character,Integer>> list=obj.getValues(hashmap);
			System.out.println();
			System.out.println("1.Choose Ascending Sort");
			System.out.println("2.Choose Descending Sort");
			System.out.println("Enter yout choice :");
			choice=sc.nextInt();
			switch(choice){
			case 1:
				System.out.println("The characters and their corresponding ascii value in ascending order :");
				for(int i=0;i<list.size();i++){
					Map.Entry<Character, Integer> m=list.get(i);
					System.out.println((i+1)+". "+m.getKey()+" : "+m.getValue());
				}
				break;
			case 2:
				System.out.println("The characters and their corresponding ascii value in descending order :");
				for(int i=list.size()-1;i>=0;i--){
					Map.Entry<Character, Integer> m=list.get(i);
					System.out.println((list.size()-i)+". "+m.getKey()+" : "+m.getValue());
				}
				break;
			default:
				System.out.println("Invalid choice");
					
			}
		}
	}

}
