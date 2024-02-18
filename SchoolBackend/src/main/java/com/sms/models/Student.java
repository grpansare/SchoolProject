package com.sms.models;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="students2")
@PrimaryKeyJoinColumn(name = "ID")
public class Student extends User{
	
	private int std;
	private String fees;
	private Date birthdate;
	public Student(int userid, String firstname, String username, String lastname, String email, String password,
			String address, String contact, String gender, boolean enable, String profile, String roleName, int std,
			String fees, Date birthdate) {
		super(userid, firstname, username, lastname, email, password, address, contact, gender, enable, profile,
				roleName);
		this.std = std;
		this.fees = fees;
		this.birthdate = birthdate;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public String isFees() {
		return fees;
	}
	public void setFees(String fees) {
		this.fees = fees;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int userid, String firstname, String username, String lastname, String email, String password,
			String address, String contact, String gender, boolean enable, String profile, String roleName) {
		super(userid, firstname, username, lastname, email, password, address, contact, gender, enable, profile, roleName);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [std=" + std + ", fees=" + fees + ", birthdate=" + birthdate + "]";
	}
	
	

}
