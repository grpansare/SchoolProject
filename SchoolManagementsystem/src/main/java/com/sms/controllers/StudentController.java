package com.sms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sms.models.StudentGrade;
import com.sms.service.StudentGradeService;

@RestController
@CrossOrigin("http://localhost:4200")

public class StudentController {
	@Autowired
	StudentGradeService sg;
 @GetMapping("getStudentGrades/{id}")
 public StudentGrade getGrades(@PathVariable int id) {
	 return sg.getStudentGrades(id);
 }
}
