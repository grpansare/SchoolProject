package com.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.dao.StudentFeeDao;
import com.sms.models.StudentFee;
@Service
public class StudentFeeService {
    @Autowired
    StudentFeeDao sd;
	public StudentFeeService() {
	}

	public void deleteStudentFee(Long feeId) {
		
	}

	public StudentFee addStudentFee(StudentFee studentFee) {
		return sd.save(studentFee);
		
	}

	public List<StudentFee> getFeesByUserId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
