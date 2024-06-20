package edu.atria.b94java.finalkeyword;

public class FinalVariable {
	
//	final int x;     final instance variable must be initialized 
	final int x=100;     // so we are initialized here
	
	//declare a static blank final variable .
	final static int y;
	
	//declaring and initializing the final variable 
	final static int z=10;
	
	
	//instance method 
	void change() {
//		x=30;   //final variable can't be reassigned
//		y=200;  //final static variable can't be reassigned
	}

//
//	@Override
//	public String toString() {
//		return "FinalVariable [x=" + x + ", y=" + y + "]";
//	}
//	
	
	
	//declare a ststic block to initialize the final static variable
	static {
		y=20;
//		z=100;  //once initialized can't be reassigned 
		System.out.println("The Value Of Y is" +y);
		
	}

}
