package com.gl.serviceImpl;

import com.gl.service.ExamTip;
import com.gl.service.Teacher;

public class GKTeacher implements Teacher {
	
	//define a private field for dependency
	private ExamTip examTip;
	
	
	public GKTeacher(ExamTip examTip) {
		this.examTip = examTip;
	}
	


	public GKTeacher() {
	}
	
	@Override
	public String getHomework() {
		
		return "read current affairs";
	}
	
	@Override
	public String getExamTip() {
		return examTip.getExamTip();
	}

}
