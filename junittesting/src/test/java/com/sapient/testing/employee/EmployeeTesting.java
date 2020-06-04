package com.sapient.testing.employee;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTesting {
	
	AddEmployee ae;
	@Before
	public void setup() {
		ae = new AddEmployee();
		ae.AddEmp(new Employee(1,"Ram","Delhi"));
		ae.AddEmp(new Employee(2,"Raj","Mumbai"));
		ae.AddEmp(new Employee(3,"Ramu","Banglore"));
	}
	@Test
	public void checkGetEmp() {
		Employee e = ae.getEmployee(1);
		assertNotNull(e);
		assertEquals("Ram",e.getName());
		e = ae.getEmployee(4);
		assertNull(e);
	}
}
