package com.sms.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Subjects")


public class Subject {
	
	@Id
	@GeneratedValue
	private int subid;
	@Column(length=10)
	private String subjectname;
	public Subject(int subid, String subjectname) {
		super();
		this.subid = subid;
		this.subjectname = subjectname;
	}
	public int getSubid() {
		return subid;
	}
	public void setSubid(int subid) {
		this.subid = subid;
	}
	public String getSubjectname() {
		return subjectname;
	}
	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}
	@Override
	public String toString() {
		return "Subject [subid=" + subid + ", subjectname=" + subjectname + "]";
	}
 
}
