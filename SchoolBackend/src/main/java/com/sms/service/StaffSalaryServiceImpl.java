package com.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.dao.StaffAttendanceDao;
import com.sms.dao.StaffSalaryRepo;
import com.sms.models.StaffSalary;
@Service
public class StaffSalaryServiceImpl implements StaffSalaryService {
   @Autowired
   StaffSalaryRepo staffsalary;
	@Override
	public List<StaffSalary> getAllPayments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StaffSalary getPaymentById(int userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StaffSalary savePayment(StaffSalary salary) {
		// TODO Auto-generated method stub
		salary.setIspaid(true);
		return staffsalary.save(salary);
	}

	@Override
	public void deletePayment(int userid) {
		// TODO Auto-generated method stub

	}

}
