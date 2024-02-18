package com.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.dao.StudentAttendanceDao;
import com.sms.dao.StudentAttendanceDao;
import com.sms.models.StaffAttendance;
import com.sms.models.StudentAttendance;
@Service
public class StudentAttendanceService  {
     @Autowired
    private  StudentAttendanceDao sa;

   


	public List<StudentAttendance> getStudentAttendances() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public StudentAttendance updateStudentAttendance(StudentAttendance sa) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public StudentAttendance saveStudentAttendance1(StudentAttendance s) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public StudentAttendance saveStudentAttendance(StudentAttendance s) {
		// TODO Auto-generated method stub
		return sa.save(s);
	}


	

   

}
