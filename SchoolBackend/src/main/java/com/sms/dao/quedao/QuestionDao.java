package com.sms.dao.quedao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sms.models.questions.Question;
@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {
	@Query("FROM Question q WHERE q.Subject = :subject")
	List<Question> getQuestionsBySubject(@Param("subject") String subject);

}
