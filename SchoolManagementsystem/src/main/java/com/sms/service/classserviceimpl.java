package com.sms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.dao.classesRepo;
import com.sms.models.Student;
import com.sms.models.classes;
@Service
public class classserviceimpl implements classService{

	
	
	@Autowired
	classesRepo cr;
	@Override
	public classes updateclass(Student s) {
		// TODO Auto-generated method stub
		Optional<classes> op=cr.findById(s.getStd());
		if(op.isPresent()) {
			classes c=op.get();
			List<Student> li=c.getStudents();
			li.add(s);
			c.setStudents(li);
			cr.save(c);
		}
		return op.get();
	}

}
