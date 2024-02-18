package com.sms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sms.models.Exam;
@Repository
public interface ExamRepo extends JpaRepository<Exam, Integer>{
List<Exam> findByStd(int std);
}
