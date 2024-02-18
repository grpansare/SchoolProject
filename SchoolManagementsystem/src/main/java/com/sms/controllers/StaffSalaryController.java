package com.sms.controllers;

import com.sms.models.StaffSalary;

import com.sms.service.StaffSalaryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/staffsalary")
public class StaffSalaryController {

    @Autowired
    private StaffSalaryService staff;



    

    @PostMapping("/add")
    public StaffSalary addPayment(@RequestBody StaffSalary s) {
    	return staff.savePayment(s);
    }

   

    
}
