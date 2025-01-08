package com.encapsulation_exercises;

//Exercise 7: Encapsulation with Aggregation
//
//Create a Course class with private fields for the course name and instructor.
//Then, create a Student class with private fields for the student's name and an 
//array of courses they are enrolled in. Implement methods to add and remove courses for a student. 
//Ensure proper encapsulation and data validation.

class Course{
	
	private String courseName;
	private String instructor;
	
	public Course(String courseName, String instructor) {
		super();
		this.courseName = courseName;
		this.instructor = instructor;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		if(courseName==null || courseName.isEmpty()) {
			System.out.println("enter valid course name");
		}
		else {
			this.courseName=courseName;
		}
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		if(instructor==null || instructor.isEmpty()) {
			System.out.println("enter valid instructor");
		}
		else {
			this.instructor=instructor;
		}
	}
	
}

class Student{
	private String studentsName;
	
	private String arr[]=new String[4];

	public Student(String studentsName, String[] arr) {
		super();
		this.studentsName = studentsName;
		this.arr = arr;
	}

	public String getStudentsName() {
		return studentsName;
	}

	public void setStudentsName(String studentsName) {
		this.studentsName = studentsName;
	}

	public String[] getArr() {
		return arr;
	}

	public void setArr(String[] arr) {
		this.arr = arr;
	}
	
}

public class Exercise_7 {

	
	public static void main(String[] args) {
		
		Course course=new Course("java", "sathya sir");
		System.out.println("course name :"+course.getCourseName());
		System.out.println("instructor :"+course.getInstructor());
		
		
	}
}
