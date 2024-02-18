
package com.sms.models.questions;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name="questions")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type",discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value="question")
public class Question {

	@Id
	@GeneratedValue
	 int qid;
	String Subject;
		String quename;
		String option1;
		String option2;
		String option3;
		String option4;
		String selectedAnswer;
		String answer;
		public Question() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Question(String quename, String option1, String option2, String option3, String option4,
				String selectedAnswer, String answer,String Subject) {
			super();
			this.quename = quename;
			this.option1 = option1;
			this.option2 = option2;
			this.option3 = option3;
			this.option4 = option4;
			this.selectedAnswer = selectedAnswer;
			this.answer = answer;
			this.Subject=Subject;
		}
		
		public int getQid() {
			return qid;
		}
		public void setQid(int qid) {
			this.qid = qid;
		}
		public String getSubject() {
			return Subject;
		}
		public void setSubject(String subject) {
			Subject = subject;
		}
		public String getQuename() {
			return quename;
		}
		public void setQuename(String quename) {
			this.quename = quename;
		}
		public String getOption1() {
			return option1;
		}
		public void setOption1(String option1) {
			this.option1 = option1;
		}
		public String getOption2() {
			return option2;
		}
		public void setOption2(String option2) {
			this.option2 = option2;
		}
		public String getOption3() {
			return option3;
		}
		public void setOption3(String option3) {
			this.option3 = option3;
		}
		public String getOption4() {
			return option4;
		}
		public void setOption4(String option4) {
			this.option4 = option4;
		}
		public String getSelectedAnswer() {
			return selectedAnswer;
		}
		public void setSelectedAnswer(String selectedAnswer) {
			this.selectedAnswer = selectedAnswer;
		}
		public String getAnswer() {
			return answer;
		}
		public void setAnswer(String answer) {
			this.answer = answer;
		}
		@Override
		public String toString() {
			return "SocialScienceQue [quename=" + quename + ", option1=" + option1 + ", option2=" + option2 + ", option3="
					+ option3 + ", option4=" + option4 + ", selectedAnswer=" + selectedAnswer + ", answer=" + answer + "]";
		}
		

}
