package com.sms.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_fees")
public class StudentFee {

    @Id
    

    private String userId;

    private String studentName;
    
    private double fees;
    private String feetype;
   public StudentFee() {
	   
   }
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public double getFees() {
	return fees;
}

public String getFeetype() {
	return feetype;
}
public void setFeetype(String feetype) {
	this.feetype = feetype;
}
public void setFees(double fees) {
	this.fees = fees;
}


public StudentFee(String userId, String studentName, double fees, String feetype) {
	super();
	this.userId = userId;
	this.studentName = studentName;
	this.fees = fees;
	this.feetype = feetype;
}

   
}
