package com.sms.service;

import org.springframework.stereotype.Service;

import com.sms.models.Student;
import com.sms.models.classes;
@Service
public interface classService {
	classes updateclass(Student s);

}
