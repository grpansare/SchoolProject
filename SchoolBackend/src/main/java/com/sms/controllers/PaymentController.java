package com.sms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sms.models.TransactionDetails;
import com.sms.service.OrderDetailsService;

@RestController
@CrossOrigin("http://localhost:4200")
public class PaymentController {
   
	@Autowired
	OrderDetailsService orderDetailsService;
	@GetMapping("/createTransaction/{amount}")
	public TransactionDetails createTransaction(@PathVariable(name="amount")  Double amount) {
	return	orderDetailsService.createTransaction(amount);
	}
}
