package com.sms.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studentgrade1")
public class StudentGrade {
	@Id
	 private int studid;
	    private String studentName;
	    private double englishmarks;
	    private double sciencemarks;
	    private double marathimarks;
	    private double ssmarks;
	    private double mathsmarks;
	    private String grade;
	    private double percentage;
		public StudentGrade() {
			super();
			// TODO Auto-generated constructor stub
		}
	   
	
		public StudentGrade(int userId, String studentName, double englishmarks, double sciencemarks,
				double marathimarks, double ssmarks, double mathsmarks, String grade, double percentage) {
			super();
			this.studid = userId;
			this.studentName = studentName;
			this.englishmarks = englishmarks;
			this.sciencemarks = sciencemarks;
			this.marathimarks = marathimarks;
			this.ssmarks = ssmarks;
			this.mathsmarks = mathsmarks;
			this.grade = grade;
			this.percentage = percentage;
		}
       

		public String getGrade() {
			return grade;
		}


		public void setGrade(String grade) {
			this.grade = grade;
		}


		public double getPercentage() {
			return percentage;
		}


		public void setPercentage(double percentage) {
			this.percentage = percentage;
		}


	
		public int getStudid() {
			return studid;
		}


		public void setStudid(int studid) {
			this.studid = studid;
		}


		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		public double getEnglishmarks() {
			return englishmarks;
		}
		public void setEnglishmarks(double englishmarks) {
			this.englishmarks = englishmarks;
		}
		public double getSciencemarks() {
			return sciencemarks;
		}
		public void setSciencemarks(double sciencemarks) {
			this.sciencemarks = sciencemarks;
		}
		public double getMarathimarks() {
			return marathimarks;
		}
		public void setMarathimarks(double marathimarks) {
			this.marathimarks = marathimarks;
		}
		public double getSsmarks() {
			return ssmarks;
		}
		public void setSsmarks(double ssmarks) {
			this.ssmarks = ssmarks;
		}
		public double getMathsmarks() {
			return mathsmarks;
		}
		public void setMathsmarks(double mathsmarks) {
			this.mathsmarks = mathsmarks;
		}
		@Override
		public String toString() {
			return "StudentGrade [userId=" + studid + ", studentName=" + studentName + ", englishmarks=" + englishmarks
					+ ", sciencemarks=" + sciencemarks + ", marathimarks=" + marathimarks + ", ssmarks=" + ssmarks
					+ ", mathsmarks=" + mathsmarks + "]";
		}
	    
	    
	    
	    
	
	
	

}
