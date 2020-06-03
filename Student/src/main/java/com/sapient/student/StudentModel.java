package com.sapient.student;

import java.util.Map;


public class StudentModel {
	private StudentList sli = new StudentList();
	public String getInfo(Student s) {
		return s.toString();
	}
	public Student getDetails(String sid) {
		Map<String,Student> li = sli.getStudentList();
		Student s = li.get(sid);
		return s;
	}
}
