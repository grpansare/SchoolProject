package com.sms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sms.models.Assignment;
import com.sms.models.Teacher;

@Service
public interface TeacherService {
	Teacher getById(int id);

	Teacher getByUsername(String username);

	Teacher addTeacher(Teacher s);

	List<Teacher> getTeachers();

	int updateTeacher(Teacher a);
	public Assignment addAssignment(Assignment a);

	List<Assignment> getAllAssignments();
}
