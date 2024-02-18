
package com.sms.controllers;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.sms.models.Assignment;
import com.sms.models.Filedata;
import com.sms.models.StudentGrade;
import com.sms.service.StudentGradeService;
import com.sms.service.TeacherService;

import jakarta.annotation.Resource;

@RestController
@CrossOrigin("http://localhost:4200") 
public class TeacherController {
	@Autowired
	TeacherService teacherService;
	@Autowired
	StudentGradeService grades;
	private final String folderPath="D:\\Student Management System\\SchoolManagementsystem\\src\\main\\resources\\static\\Assignments\"";
	
	  @PostMapping("/savegrades")
	    public StudentGrade addStudentGrade(@RequestBody StudentGrade studentGrade) {
	        return grades.addStudentGrade(studentGrade);
	    }
	  
	  @PostMapping("/addAssignment")
	    public Assignment addStudentGrade(
	    		@RequestParam("file") MultipartFile file,
	    		@RequestParam("std") String std,
	    		@RequestParam("subject") String subject,
	    		@RequestParam("lastdate") Date date
	    		) throws IOException {
		  Assignment assignment=new Assignment();
		  assignment.setLastdate(date);
		  assignment.setStd(std);
		  assignment.setSubject(subject);
		  Filedata storefile=getFile(file,assignment);
	
		  assignment.setFile(storefile);
		
	        return   teacherService.addAssignment(assignment);
	    }
	  public Filedata getFile(MultipartFile file,Assignment a) throws IOException {
	        String originalFilename = StringUtils.cleanPath(file.getOriginalFilename());
	        String filePath = folderPath + File.separator + originalFilename;
	        
	        Filedata f1 = Filedata.builder()
	                .name(originalFilename)
	                .type(file.getContentType())
	                .filePath(filePath)
	                .assignment(a)

	                .build();
	        
	        file.transferTo(new File(filePath));
	        
	        if (f1 != null) {
	            return f1;
	        }
	        return null;
	    }
	  
	  
	  @GetMapping("viewassignment")
	  public List<Assignment> getAssignments(){
		  System.out.println("in controller");
		  return teacherService.getAllAssignments();
	  }
	  @GetMapping("/download/{filePath}")
	    public ResponseEntity<Resource> downloadFile(@PathVariable("filePath") String filename) {
		  System.out.println("in downlfile");
	        // Load the file as a Resource
	        Resource resource = (Resource) new FileSystemResource(filename);

	        // Check if the file exists
	        if (!((File) resource).exists()) {
	            return ResponseEntity.notFound().build();
	        }

	        // Set the Content-Disposition header for attachment
	        return ResponseEntity.ok()
	                .contentType(MediaType.APPLICATION_OCTET_STREAM)
	                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + filename + "\"")
	                .body(resource);
	    }
	
}
