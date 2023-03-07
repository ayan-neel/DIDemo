package com.gl.driver;

import com.gl.service.Teacher;
import com.gl.serviceImpl.MathTeacher;

public class Main {

	public static void main(String[] args) {
		
		//create an object of Teacher
		Teacher teacher = new MathTeacher();
		
		//use the object to retrieve homework of a particular teacher
		System.out.println(teacher.getHomework());
		

	}

}
