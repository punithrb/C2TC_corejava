package edu.atria.b94java.exceptions;

import java.util.Scanner;

public class RuntimeException {
	public static void divide(int x, int y) {
		int z;
		try {
		z=x/y;
		System.out.println("the value os z is: " +z);
		}catch(ArithmeticException ex) {
			System.out.println("Arithematic Exception Occured : "+ex.getMessage()+ "  Erorr");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,y;
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Inside the try block");
			System.out.println("enter two numbers: ");
			x=Integer.parseInt(sc.nextLine());
			y=Integer.parseInt(sc.nextLine());
			divide(x,y);
		}catch(Exception ex) {
			System.out.println("Invalid input , \nPlz enter the valid integer input");
			
		}

	}

}
