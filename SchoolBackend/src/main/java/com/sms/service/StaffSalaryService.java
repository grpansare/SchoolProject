package com.sms.service;


import com.sms.models.StaffSalary;

import java.util.List;

public interface StaffSalaryService {
    List<StaffSalary> getAllPayments();
    StaffSalary getPaymentById(int userid);
    StaffSalary savePayment(StaffSalary salay);
    void deletePayment(int userid);
}
