package com.sms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sms.models.StaffSalary;
@Repository
public interface StaffSalaryRepo extends JpaRepository<StaffSalary, Integer>{

}
