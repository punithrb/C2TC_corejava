package edu.atria.b94java.ststickeyword;

public class MyClass {
	private int section ;  //non static variable
	private static int srNo;      // static or class variable 
	//static block
	static{
		System.out.println("within the ststic block......");
		srNo=1000;
		
	}
	MyClass(){
		System.out.println("within default constructre.....");
		srNo++;
	}
	
	//ststic method
	public static void display() {
		System.out.println(srNo);
//		System.out.println(section);      // cannot able to access the non static member
	}

	@Override
	public String toString() {
		return "MyClass [section=" + section + ", srNo=" +srNo+"]";
	}
	

}
