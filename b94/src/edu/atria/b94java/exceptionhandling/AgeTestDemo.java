package edu.atria.b94java.exceptionhandling;

import java.util.Scanner;

public class AgeTestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age;
		Scanner sc =new Scanner(System.in);
		AgeTest at=new AgeTest();
		System.out.println("Enter your age: ");
		age=sc.nextInt();
		
		try {
			at.validate(age);
		}catch(InvalidAgeException e) {
			System.err.print("Caught an Exception:\n"+e.getMessage());
		}
		sc.close();

	}

}
