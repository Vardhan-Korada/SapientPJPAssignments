package com.sapient.testing.employee;

import java.util.ArrayList;
import java.util.List;

public class AddEmployee {
	List<Employee> list;

	public AddEmployee() {
		this.list = new ArrayList<Employee>();
	}
	
	public void AddEmp(Employee emp) {
		list.add(emp);
	}
	public Employee getEmployee(int id) {
		for(Employee emp : this.list) {
			if(emp.getId() == id) {
				return emp;
			}
		}
		return null;
	}
}
