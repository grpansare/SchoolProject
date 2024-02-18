package com.sms.service;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.models.Assignment;
import com.sms.models.Student;
import com.sms.models.Teacher;

import com.sms.dao.AssignmentDao;
import com.sms.dao.TeacherRepo;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	TeacherRepo tr;
	@Autowired 
	AssignmentDao assignmentDao;
	

	@Override
	public Teacher getById(int id) {
		// TODO Auto-generated method stub
		return tr.findById(id).get();
	}

	@Override
	public Teacher getByUsername(String username) {
		// TODO Auto-generated method stub
		return tr.findByUsername(username);
	}

	@Override
	public Teacher addTeacher(Teacher s) {
		// TODO Auto-generated method stub
		return tr.save(s);
	}

	@Override
	public List<Teacher> getTeachers() {
		// TODO Auto-generated method stub
		return tr.findAll();
	}

	@Override
	public int updateTeacher(Teacher a) {
		// TODO Auto-generated method stub
		int r=0;
		 Optional<Teacher> s=tr.findById(a.getUserid());
		 if(s.isPresent()) {
			 Teacher t=s.get();
			t.setAddress(a.getAddress());
		
			
			t.setContact(a.getContact());
			t.setEmail(a.getEmail());
		    t.setQualification(a.getQualification());
			t.setFirstname(a.getFirstname());
			t.setLastname(a.getLastname());
			t.setGender(a.getGender());
			t.setUsername(a.getUsername());
			
			tr.save(t);
			r=1;
		 }
		 return r;
		 
		
	}
	
	public Assignment addAssignment(Assignment a) {
		return assignmentDao.save(a);
	}

   
//	
//	   @Override
//	    public List<Assignment> getAllAssignments() {
//	        List<Assignment> list= assignmentDao.findAll();
//	        Iterator<Assignment> it=list.iterator();
//	        while(it.hasNext()) {
//	        	Assignment a=it.next();
//	        	
//	        }
//	        
//	    }
//	   public byte[] downloadImage(String filename) throws IOException {
//	        Optional<ImageFile> imageFileOptional = imageFileRepo.findByName(filename);
//	        if (imageFileOptional.isPresent()) {
//	            String filePath = imageFileOptional.get().getFilePath();
//	            return Files.readAllBytes(Paths.get(filePath));
//	        }
//	        return null;
//	    }

	@Override
	public List<Assignment> getAllAssignments() {
		// TODO Auto-generated method stub
		 return assignmentDao.findAllWithFiledata();
	}
}
