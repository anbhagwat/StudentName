package com.ab.src;


import org.junit.Assert;
import org.junit.Test;


public class TestStudentName {

	@Test
	public void TestgetStudentName() {
		StudentName studentName1 = new StudentName();
		studentName1.setStudentFirstName("Anand");
		studentName1.setStudentLastName("Bhagwat");
		Assert.assertEquals("Anand Bhagwat", studentName1.getStudentName());
		
		StudentName studentName2 = new StudentName();
		studentName2.setStudentFirstName(null);
		studentName2.setStudentLastName(null);
		Assert.assertEquals("N/A N/A", studentName2.getStudentName());
		StudentName studentName3 = new StudentName();
		studentName3.setStudentFirstName("Anand");
		studentName3.setStudentLastName(null);
		Assert.assertEquals("Anand N/A", studentName3.getStudentName());
		
		StudentName studentName4 = new StudentName();
		studentName4.setStudentFirstName(null);
		studentName4.setStudentLastName("Bhagwat");
		Assert.assertEquals("N/A  Bhagwat", studentName4.getStudentName());
	}
	
}
