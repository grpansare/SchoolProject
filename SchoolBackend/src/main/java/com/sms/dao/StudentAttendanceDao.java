package com.sms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sms.models.StudentAttendance;
@Repository
public interface StudentAttendanceDao extends JpaRepository<StudentAttendance, Integer>{

 StudentAttendance findByStudentname(String name);
 

}
