package com.sms.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.dao.quedao.QuestionDao;
import com.sms.dao.quedao.SocialScienceRepo;
import com.sms.models.questions.Question;
import com.sms.models.questions.SocialScienceQue;

@Service

public class QuestionServiceImpl implements QuestionsService {
@Autowired
QuestionDao qdao;;
	@Override
	public List<Question> getQuestions(String Subject) {
		// TODO Auto-generated method stub
		return qdao.getQuestionsBySubject(Subject);
	}
	@Override
	public List<SocialScienceQue> getQuestions() {
		// TODO Auto-generated method stub
		return null;
	}

}
