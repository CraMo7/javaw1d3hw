package com.codeclan.craigm;

import org.junit.*;
import static org.junit.Assert.*;

public class TestStudent {
	
	Student student;
	
	@Before
	public void setup(){
		student = new Student("Craig");
	}	
	
	@Test
	public void testStudentInheritsFromUser(){
		assertEquals("Craig", student.getName());
		assertEquals(0, student.id);
	}
	
	
}
