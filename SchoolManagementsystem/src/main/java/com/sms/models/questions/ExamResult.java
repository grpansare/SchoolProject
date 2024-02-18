package com.sms.models.questions;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="examresult1")
public class ExamResult {
	
	@Id
	@GeneratedValue
	int examid;
	int studid;
	String studentname;
	String subject;
	int marks;
	
	public ExamResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExamResult(int studid, String studentname, String subject, int marks) {
		super();
		this.studid = studid;
		this.studentname = studentname;
		this.subject = subject;
		this.marks = marks;
	}

	public int getStudid() {
		return studid;
	}

	public void setStudid(int studid) {
		this.studid = studid;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "ExamResult [studid=" + studid + ", studentname=" + studentname + ", subject=" + subject + ", marks="
				+ marks + "]";
	}
	

}
