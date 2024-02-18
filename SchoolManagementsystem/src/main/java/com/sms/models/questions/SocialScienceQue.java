package com.sms.models.questions;

import org.hibernate.annotations.DialectOverride.DiscriminatorFormulas;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@DiscriminatorValue("socialscience")
public class SocialScienceQue extends Question{

	public SocialScienceQue() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SocialScienceQue(String quename, String option1, String option2, String option3, String option4,
			String selectedAnswer, String answer,String subject) {
		super(quename, option1, option2, option3, option4, selectedAnswer, answer,subject);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SocialScienceQue [qid=" + qid + ", quename=" + quename + ", option1=" + option1 + ", option2=" + option2
				+ ", option3=" + option3 + ", option4=" + option4 + ", selectedAnswer=" + selectedAnswer + ", answer="
				+ answer + ", getQuename()=" + getQuename() + ", getOption1()=" + getOption1() + ", getOption2()="
				+ getOption2() + ", getOption3()=" + getOption3() + ", getOption4()=" + getOption4()
				+ ", getSelectedAnswer()=" + getSelectedAnswer() + ", getAnswer()=" + getAnswer() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
   
}
