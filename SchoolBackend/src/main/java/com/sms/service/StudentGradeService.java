package com.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.sms.dao.StudentGradeDao;
import com.sms.dao.StudentRepo;
import com.sms.models.StudentGrade;
@Service
public class StudentGradeService{


    @Autowired
    private StudentGradeDao studentGradeDAO;
    @Autowired
    StudentRepo srepo;

  
    public StudentGrade addStudentGrade(StudentGrade studentGrade) {
    	  
    	StudentGrade st=calculatePercentageAndGrade(studentGrade);
        return studentGradeDAO.save(st);
    }

   




   
    public StudentGrade calculatePercentageAndGrade(StudentGrade st) {
        

             double totalmarks=st.getEnglishmarks()+st.getMarathimarks()+st.getSciencemarks()+st.getSsmarks()+st.getMathsmarks();

            double percentage = (totalmarks / 6) ;
              st.setPercentage(percentage);
            String grade;
            if (percentage >= 90) {
                grade = "A+";
            } else if (percentage >= 80) {
                grade = "A";
            } else if (percentage >= 70) {
                grade = "B";
            } else if (percentage >= 60) {
                grade = "C";
            } else if (percentage >= 50) {
                grade = "D";
            } else {
                grade = "F";
            }

           st.setGrade(grade);
            return st; 
        }
    
    
    
    
    
    
public   StudentGrade getStudentGrades(int id) {
	  return studentGradeDAO.findById(id).get();
  }  
  }

