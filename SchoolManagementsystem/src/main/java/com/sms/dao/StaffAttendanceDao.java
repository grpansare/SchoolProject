package com.sms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sms.models.StaffAttendance;
@Repository
public interface StaffAttendanceDao extends JpaRepository<StaffAttendance, Integer>{

    StaffAttendance findByTeachername(String name);
   @Query("From StaffAttendance s where s.userid=:userid")
	List<StaffAttendance> findByUserid(@Param("userid") int userid);

}
