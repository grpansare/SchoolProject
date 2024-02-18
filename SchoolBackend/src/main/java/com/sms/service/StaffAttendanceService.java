package com.sms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sms.models.StaffAttendance;

@Service
public interface StaffAttendanceService {
	StaffAttendance saveStaffAttendance(StaffAttendance staffAttendance);
		List<StaffAttendance> getStaffAttendance();
		StaffAttendance updateStaffAttendance(StaffAttendance staffAttendance);
		public StaffAttendance saveStaffAttendane(StaffAttendance t);
		List<StaffAttendance> getAttendanceById(int userid);
}
