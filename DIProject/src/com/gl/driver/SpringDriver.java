package com.gl.driver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gl.service.Teacher;
import com.gl.serviceImpl.GKTeacher;
import com.gl.serviceImpl.HindiTeacher;
import com.gl.serviceImpl.MathTeacher;

public class SpringDriver {

	public static void main(String[] args) {

		// 1. Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// 2. Retrieve bean from spring container
		Teacher teacher = context.getBean("teacher",MathTeacher.class);

		// 3. call methods on the bean
		System.out.println(teacher.getHomework());
		System.out.println(teacher.getExamTip());

		// 4. close the context
		context.close();
	}

}
