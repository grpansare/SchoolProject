package com.sms.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.models.Student;

import com.sms.dao.StudentRepo;
@Service

public class StudentServiceImpl implements StudentService {
   @Autowired
   StudentRepo st;
	@Override
	public Student getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getByUsername(String username) {
		// TODO Auto-generated method stub
		return st.findByUsername(username);
	}

	@Override
	public Student addStudent(Student s) {
		// TODO Auto-generated method stub
		s.setRoleName("Student");
		
		return st.save(s);
		
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return st.findAll();
	}

	@Override
	public int updateStudent(Student a) {
		// TODO Auto-generated method stub
		int r=0;
		 Student s=st.findByUsername(a.getUsername());
		 if(s!=null) {
			 
			s.setAddress(a.getAddress());
			s.setBirthdate(a.getBirthdate());
			s.setStd(a.getStd());
			s.setContact(a.getContact());
			s.setEmail(a.getEmail());
			s.setBirthdate(a.getBirthdate());
			s.setFirstname(a.getFirstname());
			s.setLastname(a.getLastname());
			s.setGender(a.getGender());
			s.setUsername(a.getUsername());
			st.save(s);
			r=1;
		 }
		 return r;
		 
		
	}

	@Override
	public List<Student> getStudByStd(int std) {
		// TODO Auto-generated method stub
		return st.findByStd(std);
	}

	
	 public long getNumberOfRecords() {
	        return st.count();
	    }
}
