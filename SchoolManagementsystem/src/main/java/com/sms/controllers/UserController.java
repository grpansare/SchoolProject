package com.sms.controllers;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sms.models.User;
import com.sms.dao.UserRepo;
import com.sms.service.UserService;

@RestController
@CrossOrigin("http://localhost:4200")
public class UserController {
	@Autowired
	UserService us;
	@Autowired
	  private JavaMailSender mailsender;
	 
	@RequestMapping("/adduser")
	public User insertuser(@RequestBody User u)
	{
		u.setRoleName("admin");
		
		return us.adduser(u);
	}
	@PostMapping("/loginuser")
	public User loginuser(@RequestBody User u)
	{
	   System.out.println(us.checkuser(u.getEmail(), u.getPassword()));
		return us.checkuser(u.getEmail(), u.getPassword());
		
		
		
	}
	@PostMapping("/sendOtp")
	public int sendOtp(@RequestBody String email)
	{ System.out.println(email);
	User user=us.getByEmail(email);
	if(user!=null) {
		return sendOtpToEmail(user);
	}
	  return 0;
		
		
		
	}
	
	private int sendOtpToEmail(User user) {
		// TODO Auto-generated method stub
		  
		String firstname=user.getFirstname();
		String lastname=user.getLastname();
		String to=user.getEmail();
		int otpLength = 6;
		int generatedOTP = generateOTP(otpLength);
		System.out.println("Generated OTP : " + generatedOTP);
		String body = "Dear " + firstname + " " + lastname + ",\n\n"
	            + "You have requested to reset your password for your student account. Please use the following One-Time Password (OTP) to complete the password reset process:\n\n"
	            + "OTP: " + generatedOTP + "\n\n"
	            + "This OTP is valid for a limited time. Please do not share this OTP with anyone. If you did not initiate this password reset, please contact your school administration.\n\n"
	            + "Thank you for using our School Management System.\n\n" 
	            + "Best Regards,";
		sendEmailforOTP(body, to);
		
		return generatedOTP;
	}
	
	
	private void sendEmailforOTP(String body, String to) {
		 SimpleMailMessage message=new SimpleMailMessage();
		  message.setFrom("edusyncplus@gmail.com");
		  message.setTo(to);
		  message.setText(body);
		  message.setSubject("Password Reset OTP - AtoZStore");
		  mailsender.send(message);
		  System.out.println("Mail Sent success");
	}
	private static int generateOTP(int length) {
		String allowedChars = "0123456789";
		StringBuilder otp = new StringBuilder(length);
		Random random = new Random();

		for (int i = 0; i < length; i++) {
			int index = random.nextInt(allowedChars.length());
			otp.append(allowedChars.charAt(index));
		}

		// Convert the OTP string to an integer
		return Integer.parseInt(otp.toString());
	}
	  
	@PostMapping("updatepassword")
	public int updatepassword(@RequestParam("email") String email,
			@RequestParam("password") String password
			) {
		System.out.println(email);
		System.out.println(password);
		System.out.println(us.updateUserPass(email,password));
		return us.updateUserPass(email,password);
	}
	

}
