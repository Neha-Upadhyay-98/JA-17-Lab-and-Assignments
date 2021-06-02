package com.capgemini.lab6collectionframework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.capgemini.lab6collectionframework.model.VotersList;

public class VoterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		VotersList obj=new VotersList();
		System.out.print("Enter the number of people : ");
		int size=sc.nextInt();

			Map<Integer,Integer> map=new HashMap<Integer,Integer>();
			for(int i=0;i<size;i++) {
				System.out.print("Enter id of Person "+(i+1)+" : ");
				int id=sc.nextInt();
				System.out.print("Enter age of Person "+(i+1)+" : ");
				int age=sc.nextInt();
				map.put(id, age);
			}
			List<Integer> list = obj.votersList(map);
			System.out.println("The id of the people who are eligible for voting are given below : ");
			int k=0;
			for(int i : list) {
				System.out.println(list.get(k++));
			}
		}
	}
