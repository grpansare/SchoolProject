package com.sms.models;

import java.sql.Date;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="staffattendance")
public class StaffAttendance {
	
	
	@Id
	@GeneratedValue
	private int attendanceId;
	
	private int userid;
	private Date date;
	private String teachername;
	private String attendance;
	

	public StaffAttendance() {
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


	public String getTeachername() {
		return teachername;
	}
  

	public String getAttendance() {
		return attendance;
	}


	public StaffAttendance(int userid, Date date, String teachername, String attendance) {
		super();
		this.userid = userid;
		this.date = date;
		this.teachername = teachername;
		this.attendance = attendance;
	}


	public void setAttendance(String attendance) {
		this.attendance = attendance;
	}


	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}


	public StaffAttendance(int userid, Date date, String teachername) {
		super();
		this.userid = userid;
		this.date = date;
		this.teachername = teachername;
	}
	
	

}
