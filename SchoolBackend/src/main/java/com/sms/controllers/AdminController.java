package com.sms.controllers;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.dao.classesRepo;
import com.sms.models.StaffAttendance;
import com.sms.models.Student;
import com.sms.models.Subject;
import com.sms.models.Teacher;
import com.sms.models.classes;
import com.sms.service.StaffAttendanceService;
import com.sms.service.StudentService;
import com.sms.service.TeacherService;
import com.sms.service.classService;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	StudentService str;
	@Autowired
	TeacherService ts;
	@Autowired
	StaffAttendanceService staffdao;
	@Autowired
	classService cs;

	@Autowired
	classesRepo cr;

	@PostMapping("/addStudent")

	public Student addstudent(@RequestBody Student s) {

		System.out.println("classname" + s.getStd());
		Student s1 = str.getByUsername(s.getUsername());
		if (s1 != null) {
			return null;
		} else {
			classes c = cs.updateclass(s);
			System.out.println(c);
			return str.addStudent(s);
		}

	}

	@PostMapping("/addTeacher")
	public Teacher addTeacher(@RequestBody Teacher t) {

		Teacher s1 = ts.getByUsername(t.getUsername());
		if (s1 != null) {
			return null;
		} else {

			t.setRoleName("TEACHER");
			return ts.addTeacher(t);

		}

	}

	@PostMapping("/updateStudent")
	public int updatestudent(@RequestBody Student s) {
		int r = str.updateStudent(s);
		return r;

	}
	@PostMapping("/updateTeacher")
	public int updateTeacher(@RequestBody Teacher t) {
		int r = ts.updateTeacher(t);
		return r;

	}

	@GetMapping("/viewStudent")
	public List<Student> viewStudent() {

		return str.getStudents();

	}

	@GetMapping("/viewTeachers")
	public List<Teacher> viewTeachers() {

		return ts.getTeachers();

	}

	@GetMapping("/stafflist")
	public List<Teacher> stafflist() {

		return ts.getTeachers();

	}

	@PostMapping("/addclasses")
	public classes addclass(@RequestBody classes s) {

		cr.save(s);
		return s;

	}

	@GetMapping("/getclasses")
	public List<classes> addclass() {

		return cr.findAll();

	}

	@GetMapping("/studentcount")
	public long getNumberOfRecords() {
		return str.getNumberOfRecords();
	}

	@GetMapping("/getclass/{classno}")
	public classes addclass(@PathVariable int classno) {

		classes c = cr.findById(classno).get();
		Subject s1 = new Subject(1, "Marathi");
		Subject s2 = new Subject(2, "English");
		Subject s3 = new Subject(3, "Science");
		Subject s4 = new Subject(4, "Maths");
		Subject s5 = new Subject(5, "Hindi");

		Subject s6 = new Subject(6, "Social Science");

		List<Subject> sublist = new ArrayList<>();
		sublist.add(s1);
		sublist.add(s2);
		sublist.add(s3);
		sublist.add(s4);
		sublist.add(s5);
		sublist.add(s6);
		c.setSublist(sublist);
		List<Student> students = str.getStudByStd(classno);
		c.setStudents(students);
		return c;

	}

	@GetMapping("/getteacher/{id}")
	public String getname(@PathVariable int id) {

		Teacher t = ts.getById(id);
		String name = t.getFirstname() + " " + t.getLastname();
		System.out.println(name);
		return name;

	}
	@GetMapping("/getstudentsbystd/{std}")
	public List<Student> getstudentstd(@PathVariable int std) {

		List<Student>  students=str.getStudByStd(std);
	
		return students;

	}

}
