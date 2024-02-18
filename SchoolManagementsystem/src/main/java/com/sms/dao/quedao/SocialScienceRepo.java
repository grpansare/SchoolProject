package com.sms.dao.quedao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sms.models.questions.Question;
import com.sms.models.questions.SocialScienceQue;
@Repository
public interface SocialScienceRepo extends JpaRepository<SocialScienceQue, Integer>{
    List<SocialScienceQue> findAll();
}
