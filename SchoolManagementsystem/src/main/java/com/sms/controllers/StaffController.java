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
import com.sms.service.StaffAttendanceService;

@RestController
@CrossOrigin("http://localhost:4200") 
public class StaffController {

	@Autowired
	StaffAttendanceService sa;
	
	
	@GetMapping("/getStafflist")
	public List<StaffAttendance> getStafflist(){
		return sa.getStaffAttendance();
	}
	@PostMapping("/savaattendance")
	public StaffAttendance savaattendance(@RequestBody StaffAttendance s){
		return sa.saveStaffAttendance(s);
	}
	@GetMapping("getAttendance/{userid}")
	public List<StaffAttendance> getAttendance(@PathVariable int userid) {
		System.out.println(userid);
		return sa.getAttendanceById(userid);
	}
	
}
