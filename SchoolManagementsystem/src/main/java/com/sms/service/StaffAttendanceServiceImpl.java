package com.sms.service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.models.StaffAttendance;
import com.sms.models.Teacher;
import com.sms.dao.StaffAttendanceDao;


@Service
public class StaffAttendanceServiceImpl implements StaffAttendanceService {

	  @Autowired
	    private StaffAttendanceDao staffAttendanceDAO;

	   

		
	

		@Override
		public StaffAttendance saveStaffAttendance(StaffAttendance staffAttendance) {
			// TODO Auto-generated method stub
			return staffAttendanceDAO.save(staffAttendance);
		}






		@Override
		public List<StaffAttendance> getStaffAttendance() {
			// TODO Auto-generated method stub
			return staffAttendanceDAO.findAll();
		}
        
		public StaffAttendance updateStaffAttendance(StaffAttendance staffAttendance) {
			// TODO Auto-generated method stub
			StaffAttendance s=  staffAttendanceDAO.findByTeachername(staffAttendance.getTeachername());
			s.setAttendance(staffAttendance.getAttendance());
			s.setDate(staffAttendance.getDate());
			return staffAttendanceDAO.save(s);
		}
		public StaffAttendance saveStaffAttendane(StaffAttendance t) {
			
			
				return 	staffAttendanceDAO.save(t);
		}






		@Override
		public List<StaffAttendance> getAttendanceById(int userid) {
			// TODO Auto-generated method stub
			return staffAttendanceDAO.findByUserid(userid);
		}

	   
	}
   

