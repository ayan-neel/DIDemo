package com.gl.serviceImpl;

import com.gl.service.ExamTip;
import com.gl.service.Teacher;

public class MathTeacher implements Teacher {

	//define a private field for dependency
	private ExamTip examTip;
	
	public MathTeacher(ExamTip examTip) {
		this.examTip = examTip;
	}
	
	

	public MathTeacher() {
	}

	@Override
	public String getHomework() {
		
		return "practice statistics";
	}
	
	@Override
	public String getExamTip() {
		return examTip.getExamTip();
	}

}
