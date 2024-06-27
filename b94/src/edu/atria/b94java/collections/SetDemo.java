package edu.atria.b94java.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s=new HashSet();
		System.out.println("The Elements in the set: "+s);
		s.add(1);
		s.add(true);
		s.add("Java");
		System.out.println("the elements in the list after using add: "+s);
		

	}

}
