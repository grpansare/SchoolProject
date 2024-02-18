package com.sms.models.questions;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("geography")

public class Geography  extends Question {

	public Geography() {
		// TODO Auto-generated constructor stub
	}

	public Geography(String quename, String option1, String option2, String option3, String option4,
			String selectedAnswer, String answer, String Subject) {
		super(quename, option1, option2, option3, option4, selectedAnswer, answer, Subject);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Geography [qid=" + qid + ", Subject=" + Subject + ", quename=" + quename + ", option1=" + option1
				+ ", option2=" + option2 + ", option3=" + option3 + ", option4=" + option4 + ", selectedAnswer="
				+ selectedAnswer + ", answer=" + answer + ", getQid()=" + getQid() + ", getSubject()=" + getSubject()
				+ ", getQuename()=" + getQuename() + ", getOption1()=" + getOption1() + ", getOption2()=" + getOption2()
				+ ", getOption3()=" + getOption3() + ", getOption4()=" + getOption4() + ", getSelectedAnswer()="
				+ getSelectedAnswer() + ", getAnswer()=" + getAnswer() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
   
	
}