package com.student.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class Student_Controller {
	public void getStudent()
	{
		System.out.println("Hello From Student");
	}

}
