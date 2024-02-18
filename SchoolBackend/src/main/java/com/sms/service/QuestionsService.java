package com.sms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sms.models.questions.Question;
import com.sms.models.questions.SocialScienceQue;

@Service
public interface QuestionsService {
   List<SocialScienceQue> getQuestions();
   List<Question> getQuestions(String Subject);
}
