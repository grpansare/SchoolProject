package com.sms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sms.models.Teacher;
@Repository

public interface TeacherRepo extends JpaRepository<Teacher, Integer>{
    Teacher findByUsername(String username);
   
}
