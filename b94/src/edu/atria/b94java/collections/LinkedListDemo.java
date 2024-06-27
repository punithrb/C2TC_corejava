package edu.atria.b94java.collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> li=new LinkedList();
		li.add(10);
		li.add(20);
		li.add(30);
		System.out.println("the elements in the list are:"+li);
		li.add(1,15);
		System.out.println("the elements in the list are:"+li);
//		li.add(-1,15);
//		System.out.println("the elements in the list are:"+li);
		
		li.addFirst(0);
		li.addLast(100);
		System.out.println("the elements in the list are:"+li);
		System.out.println("first element is: "+li.getFirst());
		System.out.println("last element is: "+li.getLast());
		li.remove(0);
		li.removeLast();
		System.out.println(li);
		
	}

}
