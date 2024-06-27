package edu.atria.b94java.collections;
import java.util.List;
import java.util.ArrayList;
public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		List li=new List();  //cannot initiate list interface
		
		List li=new ArrayList();
		System.out.print("the elements in the list is:"+li+"\n");
		li.add(1);
		li.add("Adress");
		li.add(98.3);
		li.add(null);
		li.add(1);
		li.add(1);
		li.add(null);
		System.out.print("the elements in the list is:"+li);

	}

}
