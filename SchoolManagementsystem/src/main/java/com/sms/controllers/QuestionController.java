package com.sms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sms.models.questions.Question;
import com.sms.models.questions.SocialScienceQue;
import com.sms.service.QuestionsService;

@RestController
@CrossOrigin("http://localhost:4200") 
public class QuestionController { 
	 @Autowired
	 QuestionsService qs;
	@GetMapping("getssquestions/{subject}")
	
	public List<Question> getQuestions(@PathVariable String subject){
		return qs.getQuestions(subject);
	}

}
