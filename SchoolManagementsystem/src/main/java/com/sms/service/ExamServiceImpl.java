package com.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.dao.ExamRepo;
import com.sms.dao.quedao.ExamResultDao;
import com.sms.models.Exam;
import com.sms.models.questions.ExamResult;
@Service
public class ExamServiceImpl implements ExamService {
  @Autowired
  ExamRepo exrepo;
  @Autowired
  ExamResultDao resultdao;
	@Override
	public List<Exam> getExams() {
		// TODO Auto-generated method stub
		return exrepo.findAll();
	}
	public Exam scheduleexam(Exam e) {
		return exrepo.save(e);
	}
	public List<Exam> getStudentExams(int std){
		return exrepo.findByStd(std);
	}
	public ExamResult saveResult(ExamResult result) {
		return resultdao.save(result);
	}

}
