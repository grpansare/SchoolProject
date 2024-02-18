package com.sms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sms.models.StudentGrade;

@Repository
public interface StudentGradeDao extends JpaRepository<StudentGrade, Integer>{

	StudentGrade save(StudentGrade studentGrade);
    
    
}
