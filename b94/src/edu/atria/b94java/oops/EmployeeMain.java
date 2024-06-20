package edu.atria.b94java.oops;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the employee details");
		int id=sc.nextInt();
		String name=sc.next();
		double salary=sc.nextDouble();
		String designation=sc.next();
		
		
		Employee eOne=new Employee();
		eOne.setId(id);
		eOne.setName(name);
		eOne.setSalary(salary);
		eOne.setDesignation(designation);
		
		System.out.println("the employee id is : "+eOne.getId());
		System.out.println("the employee Name is : "+eOne.getName());
		System.out.println("the employee Salary is : "+eOne.getSalary());
		System.out.println("the employee Designaton is : "+eOne.getDesignation());

//		//calling parametraized constructor
//		Employee eTwo= new Employee(101, "punith", 100000, "Developer");
//		System.out.println(eTwo);
//		
	}

}
