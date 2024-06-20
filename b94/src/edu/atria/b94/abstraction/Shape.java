package edu.atria.b94.abstraction;


//abstract class can have both abstract and non-abstract methods 

//only it is possible to make the class abstract only if the program contains atleast one abstract method
public abstract  class Shape {
	//static float area
	float area;
	
	//abstract method
	public abstract float calculateArea();
	
	
	//non-abstratc method
	public void display() {
		System.out.println("The area of the Shape is:" + area);
	}

}
