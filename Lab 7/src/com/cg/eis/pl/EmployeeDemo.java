package com.cg.eis.pl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cg.eis.bean.Employee;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		HashMap<String,Employee> hashmap=new HashMap<String,Employee>();
		HashMap<String,Integer> alist=new HashMap<String,Integer>();
		int choice;
		char ch='y';
		while(ch=='y') {
			System.out.println("1. Add Employee Details");
			System.out.println("2. Display Employee Details Corresponding to Insurance Scheme");
			System.out.println("3. Delete Employee Details");
			System.out.println("Enter your choice : ");
			choice=sc.nextInt();
			switch(choice) {
			case 1 : System.out.print("Enter the number of employees : ");
			int numOfEmp=sc.nextInt();
			Employee emp[]=new Employee[numOfEmp];
			for(int i=0;i<numOfEmp;i++) {
				emp[i]=new Employee();
			}
			for(int i=0;i<numOfEmp;i++) {
				System.out.println("Enter id : ");
				emp[i].id=sc.nextInt();
				System.out.println("Enter name : ");
				emp[i].name=sc.next();
				System.out.println("Enter salary : ");
				emp[i].salary=sc.nextDouble();
				System.out.println("Enter designation : ");
				sc.nextLine();
				emp[i].designation=sc.nextLine();
				hashmap.put(emp[i].getInsuranceScheme(), emp[i]);
				alist.put(emp[i].getInsuranceScheme(),emp[i].id);
				System.out.println();
			}
			System.out.println("Hash Map after adding employee details :\n");
			for(HashMap.Entry<String, Employee> m : hashmap.entrySet()) {
				System.out.println(m.getValue());
			}
			break;
			case 2 : if(hashmap.size()<1) {
				System.out.println("\nNo data found...");
			}else {
				System.out.print("Enter the insurance scheme : ");
				sc.nextLine();
				String ins_scheme=sc.nextLine();
				System.out.print("The employee details for the given insurance scheme are :\n ");
				for(HashMap.Entry<String, Employee> m : hashmap.entrySet()) {
					if(m.getKey().equalsIgnoreCase(ins_scheme))
						System.out.println(m.getValue());
				}
			}
			break;
			case 3 :if(hashmap.size()<1) {
				System.out.println("\nNo data found...");
			}else {
				System.out.print("Enter the id of the employee you want to delete : ");
				int id=sc.nextInt();
				for(Map.Entry<String,Integer> m : alist.entrySet()) {
					if(m.getValue()==id)
						hashmap.remove(m.getKey());
				}
				System.out.println("Hash Map after deleting employee details :\n");
				for(HashMap.Entry<String, Employee> m : hashmap.entrySet()) {
					System.out.println(m.getValue());
				}
			}
			break;
			default : System.out.println("Enter correct choice (1-3)....");
			}
			System.out.println();
			System.out.print("Do you want to continue?(y/n) ");
			ch=sc.next().charAt(0);
		}
	}

}
