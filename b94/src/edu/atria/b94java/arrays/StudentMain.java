package edu.atria.b94java.arrays;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student arr[]=new Student[5];
		arr[0]=new Student(11,"rohit");
		arr[1]=new Student(12,"rahul");
		arr[2]=new Student(13,"ravin");
		arr[3]=new Student(14,"rishi");
		arr[4]=new Student(14,"ravin");
		
		for(Student s:arr) {
			System.out.println("the age of the student is:" +s.getAge()+" ");
			System.out.println("the name of the student is:" +s.getName());
		}
	}

}
