package com.sms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sms.models.StaffAttendance;
import com.sms.models.StudentAttendance;
import com.sms.service.StudentAttendanceService;
import com.sms.service.StudentService;

@RestController
@CrossOrigin("http://localhost:4200") 
public class StudentAttendanceController {
   @Autowired
   StudentAttendanceService sc;
   @Autowired
   StudentService st;
   
	@PostMapping("savastudentAttendance")
	public StudentAttendance savastudentAttendance(@RequestBody StudentAttendance s) {
		return sc.saveStudentAttendance(s);
	}

	
}
