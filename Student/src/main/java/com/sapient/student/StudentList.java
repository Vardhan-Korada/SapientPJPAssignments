package com.sapient.student;

import java.util.HashMap;
import java.util.Map;


public class StudentList {
	private Map<String,Student> li;
	public Map<String,Student> getStudentList(){
		li = new HashMap<String,Student>();
		li.put("001",new Student("Vardhan","001","23/02/1999","ECE"));
		li.put("002",new Student("Rakesh","002","25/12/1999","ME"));
		li.put("003",new Student("Bahadur","003","13/02/1999","CSE"));
		li.put("004",new Student("Raj","004","07/06/1998","EEE"));
		li.put("005",new Student("Vardhan","005","01/01/1999","ECE"));
		return li;
	}
}
