package com.sms.models;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="studentattendance")
public class StudentAttendance {
	@Id
	private int userid;
	private Date date;
	private String studentname;
	private String attendance;

	public StudentAttendance() {
		// TODO Auto-generated constructor stub
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getAttendance() {
		return attendance;
	}

	public void setAttendance(String attendance) {
		this.attendance = attendance;
	}

	public StudentAttendance(int userid, Date date, String studentname, String attendance) {
		super();
		this.userid = userid;
		this.date = date;
		this.studentname = studentname;
		this.attendance = attendance;
	}
	
	

}
