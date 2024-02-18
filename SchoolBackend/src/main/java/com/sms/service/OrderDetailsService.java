package com.sms.service;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.sms.models.TransactionDetails;

@Service
public class OrderDetailsService {
	private static final String KEY="rzp_test_bY5Xo5bNINFPp4";
	private static final String KEY_SECRET="DvusqCZ2d1N7cI6fN9pM3Sg6";
	private static final String currency="INR";
	
	public TransactionDetails createTransaction(Double amount) {
		try {
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("amount", (amount*100));
			jsonObject.put("currency", currency);
			RazorpayClient razorpayClient=new RazorpayClient(KEY, KEY_SECRET);
		Order order=	razorpayClient.orders.create(jsonObject);
		System.out.println(order);
		return prepareTransactionDetails(order);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	private TransactionDetails prepareTransactionDetails(Order order) {
		String orderid=order.get("id");
		String currency=order.get("currency");
		Integer amount=order.get("amount");
		TransactionDetails transactionDetails=new TransactionDetails(orderid,currency,amount,KEY);
		return transactionDetails;
	}

}
