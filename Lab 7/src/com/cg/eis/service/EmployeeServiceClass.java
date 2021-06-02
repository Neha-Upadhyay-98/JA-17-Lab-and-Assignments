package com.cg.eis.service;

import java.util.Scanner;

import com.cg.eis.bean.Employee;

interface EmployeeService{
	void getEmpDetails();
	void displayEmpDetails();
}
public class EmployeeServiceClass extends Employee implements EmployeeService {

	Employee e=new Employee();
	@Override
	public void getEmpDetails() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id : ");
		e.id=sc.nextInt();
		System.out.println("Enter name : ");
		e.name=sc.next();
		System.out.println("Enter salary : ");
		e.salary=sc.nextDouble();
		System.out.println("Enter designation : ");
		e.designation=sc.next();
	}

	@Override
	public void displayEmpDetails() {
		// TODO Auto-generated method stub
		e.insuranceScheme="No Scheme";
		if((e.salary>=5000 && e.salary<20000) && e.designation.equalsIgnoreCase("System Associate"))
			e.insuranceScheme="Scheme C";
		else if((e.salary>=20000 && e.salary<40000) && e.designation.equalsIgnoreCase("Programmer"))
			e.insuranceScheme="Scheme B";
		else if(e.salary>=40000 && e.designation.equalsIgnoreCase("Manager"))
			e.insuranceScheme="Scheme A";
		else if(e.salary<5000 && e.designation.equalsIgnoreCase("Clerk"))
			e.insuranceScheme="No Scheme";
		System.out.println("Employee id\tName\tSalary\tDesignation\tInsurance scheme");
		System.out.println("================================================================");
		System.out.println(e.id+"\t\t"+e.name+"\t"+e.salary+"\t"+e.designation+"\t\t"+e.insuranceScheme);
	}

}
