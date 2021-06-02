package com.capgemini.lab6collectionframework;

import java.util.HashMap;
import java.util.Scanner;

import com.capgemini.lab6collectionframework.model.Students;

public class StudentsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		Students obj=new Students();
		System.out.print("Enter the strength of the class : ");
		int size=sc.nextInt();
		if(size<1)
			System.out.println("Cannot Proceed...Strength of class should be 1 or more.");
		else {
			HashMap<Integer,Integer> hashmap=new HashMap<>();
			for(int i=0;i<size;i++) {
				System.out.print("Enter the registration no. of Student "+(i+1)+" : ");
				int regNo=sc.nextInt();
				System.out.print("Enter the marks of Student "+(i+1)+" : ");
				int marks=sc.nextInt();
				hashmap.put(regNo,marks);
			}
			HashMap<Integer,String> output=obj.getStudents(hashmap);
			System.out.print("The registration number of the students along with the corresponding medal types are given below :\n");
			for(HashMap.Entry<Integer,String> p : output.entrySet()) {
				System.out.println("Registration Number : "+p.getKey()+", Medal Type : "+p.getValue());
			}
		}
	}

}
