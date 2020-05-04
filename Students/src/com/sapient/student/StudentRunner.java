package com.sapient.student;

import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.function.Predicate;

public class StudentRunner {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//Initializing needed
		List<Student> li = new LinkedList<Student>();
		Predicate<Student> p1 = (s) -> s.city.equals("Delhi");
		// Adding Students
		Student s1 = ReadStudent();
		li.add(s1);
		Student s2 = ReadStudent();
		li.add(s2);
		Student s3 = ReadStudent();
		li.add(s3);
		Student s4 = ReadStudent();
		li.add(s4);
		//Applying Methods
		System.out.println("Displaying All Students...");
		li.forEach(StudentRunner::display);
		System.out.println("==================");
		System.out.println("Displaying Students belonging to Delhi");
		li.stream().filter(p1).forEach(StudentRunner::display);
		System.out.println("==================");
		System.out.println("Displaying Alphabetically");
		li.stream().sorted((x,y) -> x.name.compareTo(y.name)).forEach(StudentRunner::display);
		System.out.println("==================");
		System.out.println("Displaying on City Basis");
		li.stream().sorted((x,y) -> x.city.compareTo(y.city)).forEach(StudentRunner::display);
		System.out.println("==================");
		System.out.println("Finding Student");
		System.out.print("Enter id to findout the student: ");
		int id = sc.nextInt();
		boolean found = false;
		try {
			for(Student p:li) {
				if(Integer.parseInt(p.id) == id) {
					StudentRunner.display(p);
					found = true;
				} 
			}
			if(!found) {
				throw new Exception("Student not in the list..");
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static Student ReadStudent() {
		System.out.print("Enter Student Name,Id,City seperated by a comma(,) : ");
		String[] details = sc.nextLine().split(",");
		Student s = new Student();
		s.name = details[0];
		s.id = details[1];
		s.city = details[2];
		return s;
	}
	public static void display(Student s) {
		System.out.println(s.name+","+s.id+","+s.city);
	}
}
