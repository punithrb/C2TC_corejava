package edu.atria.b94.polymorphism;

public class OverridingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rbi bankOne = new sbi();
		System.out.println(bankOne.getRI());
		
		rbi bankTwo=new icici();
		System.out.println(bankTwo.getRI());
		

	}

}
