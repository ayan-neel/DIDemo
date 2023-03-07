package com.gl.serviceImpl;

import com.gl.service.ExamTip;
import com.gl.service.Teacher;

public class HindiTeacher implements Teacher {
	
	private ExamTip examTip;

	@Override
	public String getHomework() {

		return "do one recital";
	}
	
	public HindiTeacher(){
	}
	
	//defining a constructor for dependency injection
	public HindiTeacher(ExamTip examTip) {
		this.examTip = examTip;
	}
	public void doInitialJob()
	{
		System.out.println("initjob");
		
	}
	public void destroyJob()
	{
		System.out.println("destroyjob");
	}
	@Override
	public String getExamTip()
	{
		return examTip.getExamTip();
	}

}
