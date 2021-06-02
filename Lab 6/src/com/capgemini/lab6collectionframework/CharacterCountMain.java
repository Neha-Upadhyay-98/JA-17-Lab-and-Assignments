package com.capgemini.lab6collectionframework;

import java.util.Map;
import java.util.Scanner;

import com.capgemini.lab6collectionframework.model.CharacterCount;

public class CharacterCountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		CharacterCount obj=new CharacterCount();
		System.out.println("Enter size of character array :");
		int size=sc.nextInt();
		if(size<1)
			System.out.println("Size should be 1 or more");
		else{
			char arr[]=new char[size];
			for(int i=0;i<size;i++){
				System.out.print("Enter character no."+(i+1)+" : ");
				arr[i]=sc.next().charAt(0);
			}
			Map<Character,Integer> map=obj.countCharacter(arr);
			System.out.println("The number of times each character appears in the array is given below:");
			for(Map.Entry<Character, Integer> m : map.entrySet()){
				System.out.println("Character : "+m.getKey()+", Frequency : "+m.getValue());
			}
		}
	}

}
