package edu.atria.b94.abstraction;

public class AbstractClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//cannot initiate abstract class shape
		
		//Shape s=new Shape(2.0f);
		
		Shape sOne=new Square(2.5f);
		sOne.calculateArea();
		sOne.display();
		
		Shape sTwo=new Rectangle(7,5.5f);
		sTwo.calculateArea();
		sTwo.display();

	}

}
