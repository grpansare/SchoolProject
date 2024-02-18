package com.sms.models;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
@Entity
@Table(name="Teachers")
@PrimaryKeyJoinColumn(name = "ID")
public class Teacher extends User{
	String qualification;

	



	public Teacher(int userid, String firstname, String username, String lastname, String email, String password,
			String address, String contact_no, String gender, boolean enable, String profile, String roleName,
			String qualification) {
		super(userid, firstname, username, lastname, email, password, address, contact_no, gender, enable, profile,
				roleName);
		this.qualification = qualification;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(int userid, String firstname, String username, String lastname, String email, String password,
			String address, String contact, String gender, boolean enable, String profile, String roleName) {
		super(userid, firstname, username, lastname, email, password, address, contact, gender, enable, profile, roleName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Teacher [qualification=" + qualification + "]";
	}
	

}
