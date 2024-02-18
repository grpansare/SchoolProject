package com.sms.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.models.StudentFee;
import com.sms.service.StudentFeeService;

@RestController
@RequestMapping("student-fees")
@CrossOrigin("http://localhost:4200") 
public class StudentFeeController {

    private  StudentFeeService studentFeeService;

    public StudentFeeController(StudentFeeService studentFeeService) {
        this.studentFeeService = studentFeeService;
    }

   

    @PostMapping("/add")
    public StudentFee addStudentFee(@RequestBody StudentFee studentFee) {
       return studentFeeService.addStudentFee(studentFee);
     
    }


    @DeleteMapping("/delete/{feeId}")
    public ResponseEntity<String> deleteStudentFee(@PathVariable Long feeId) {
        studentFeeService.deleteStudentFee(feeId);
        return ResponseEntity.ok("Student fee deleted successfully");
    }

}