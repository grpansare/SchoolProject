package com.sms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sms.models.Assignment;
@Repository
public interface AssignmentDao extends  JpaRepository<Assignment, Integer> {

	 @Query("SELECT DISTINCT a FROM Assignment a LEFT JOIN FETCH a.file")
	    List<Assignment> findAllWithFiledata();

}
