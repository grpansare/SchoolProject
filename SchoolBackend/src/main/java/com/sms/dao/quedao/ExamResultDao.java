package com.sms.dao.quedao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.models.questions.ExamResult;

public interface ExamResultDao extends JpaRepository<ExamResult, Integer>{
  
}
