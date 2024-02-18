package com.sms.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="staffsalary")
public class StaffSalary {
	@Id
	   private int teacherid;
	    private String teacherName;
	    private double salary;
	    private boolean ispaid;
		public int getTeacherid() {
			return teacherid;
		}
		
		public StaffSalary() {
			super();
			// TODO Auto-generated constructor stub
		}

		public void setTeacherid(int teacherid) {
			this.teacherid = teacherid;
		}
		public String getTeacherName() {
			return teacherName;
		}
		public void setTeacherName(String teacherName) {
			this.teacherName = teacherName;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public boolean isIspaid() {
			return ispaid;
		}
		public void setIspaid(boolean ispaid) {
			this.ispaid = ispaid;
		}
		public StaffSalary(int teacherid, String teacherName, double salary, boolean ispaid) {
			super();
			this.teacherid = teacherid;
			this.teacherName = teacherName;
			this.salary = salary;
			this.ispaid = ispaid;
		}
		@Override
		public String toString() {
			return "StaffSalary [teacherid=" + teacherid + ", teacherName=" + teacherName + ", salary=" + salary
					+ ", ispaid=" + ispaid + "]";
		}
	    
}
