package com.sms.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderColumn;
import jakarta.persistence.Table;
@Entity
@Table(name="classlist")
public class classes {
	
	@Id
	private int standard;
	@OneToMany(cascade = CascadeType.ALL)  
	@JoinColumn(name="standard")  
	@OrderColumn(name="no")  
	private List<Student> students;
	@OneToMany(cascade = CascadeType.ALL)  
	@JoinColumn(name="std")  
	@OrderColumn(name="no")  
	private List<Subject> sublist;
	
	
	public classes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStandard() {
		return standard;
	}
	public void setStandard(int standard) {
		this.standard = standard;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "classes [standard=" + standard + ", students=" + students + "]";
	}
	public classes(int standard, List<Student> students) {
		super();
		this.standard = standard;
		this.students = students;
	}
	public List<Subject> getSublist() {
		return sublist;
	}
	public void setSublist(List<Subject> sublist) {
		this.sublist = sublist;
	}
	
	
	

}
