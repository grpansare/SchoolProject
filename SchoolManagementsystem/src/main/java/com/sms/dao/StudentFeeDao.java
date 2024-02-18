package com.sms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.models.StudentFee;

public interface StudentFeeDao extends JpaRepository<StudentFee, Integer>{

}
