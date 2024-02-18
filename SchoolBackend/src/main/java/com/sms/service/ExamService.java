package com.sms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sms.models.Exam;
import com.sms.models.questions.ExamResult;
@Service
public interface ExamService {
  List<Exam> getExams();
  Exam scheduleexam(Exam e);
  List<Exam> getStudentExams(int std);
  ExamResult saveResult(ExamResult result);
}
