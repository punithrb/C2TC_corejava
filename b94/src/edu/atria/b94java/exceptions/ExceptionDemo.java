package edu.atria.b94java.exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Key words use in exception= try,catch,finally,throw,throws
		try
		{
			int x[];
			x=new int[] {1,2,3,4};
			System.out.println(x[6]);
			
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("index is out of bounds..." +ex.getMessage());
			}
		System.out.println("Hello");

		
	}

}
