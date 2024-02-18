package com.sms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sms.dao.quedao.ExamResultDao;
import com.sms.models.Exam;
import com.sms.models.questions.ExamResult;
import com.sms.service.ExamService;
@RestController
@CrossOrigin("http://localhost:4200") 
public class ExamController {
  @Autowired
  ExamService ex;
  @Autowired
  ExamResultDao exdao;
	
	
	@GetMapping("getExams")
	public List<Exam> getAllExams(){
		return ex.getExams();
	}
	@PostMapping("/saveexam")
	public Exam saveexam(@RequestBody Exam e){
		return ex.scheduleexam(e);
	}
	@GetMapping("/getStudentExams/{std}")
	public List<Exam> saveexam(@PathVariable int std){
		return ex.getStudentExams(std);
	}
	@PostMapping("/saveresult")
	public ExamResult saveresult(@RequestBody ExamResult er){
		return ex.saveResult(er);
	}
	@GetMapping("/getresult")
	public List<ExamResult> getresult(){
		return exdao.findAll();
	}
	
}
