package com.ab.src;

public class StudentName {
	String firstName = null; 
	String lastName = null;
 public String getStudentName() {
	 String returnValue = null;
	 
	 
	if ((this.firstName != null && this.lastName != null)) {
		 return this.firstName+" "+this.lastName;
	}
	 	
	 else if ((this.firstName != null && this.lastName == null)) {
		 return this.firstName+" "+"N/A";
		 
	}
	 else if ((this.firstName == null && this.lastName != null)) {
		 return "N/A"+" "+this.lastName;
		 
	}
	 else
		 if(this.firstName == null && this.lastName == null)
			 return "N/A"+" "+ "N/A";
	 
	return null;
	 
 }
 
 public void setStudentFirstName(String firstName) {
	 this.firstName = firstName;
	 
 }
 
 public void setStudentLastName(String lastName) {
	 this.lastName = lastName;
	
	 
 }
}
