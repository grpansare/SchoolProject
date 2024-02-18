package com.sms.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.sms.models.Student;
import com.sms.models.Teacher;

@Service
public interface StudentService {
    Student getById(int id);
    Student getByUsername(String username);
    Student addStudent(Student s);
    List<Student> getStudents();
    int updateStudent(Student a);
    List<Student> getStudByStd(int std);
    long getNumberOfRecords();
	
}
