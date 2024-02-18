package com.sms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sms.models.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
	Student findByUsername(String username);

	List<Student> findByStd(int std);
}
