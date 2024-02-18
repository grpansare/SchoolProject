package com.sms.models;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="exams")
public class Exam {
	@Id
	@GeneratedValue
	private int examid;
	private String subject;
	private Date examdate;
	private int std;
	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Exam(int examid, String subject, Date examdate, int std) {
		super();
		this.examid = examid;
		this.subject = subject;
		this.examdate = examdate;
		this.std = std;
	}
	public int getExamid() {
		return examid;
	}
	public void setExamid(int examid) {
		this.examid = examid;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Date getExamdate() {
		return examdate;
	}
	public void setExamdate(Date examdate) {
		this.examdate = examdate;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	@Override
	public String toString() {
		return "Exam [examid=" + examid + ", subject=" + subject + ", examdate=" + examdate + ", std=" + std + "]";
	}
	

}
