package com.pradeep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashboardController {
	
	
	@RequestMapping("/send-money")
	public String sendMoney() {
		return "sendMoney";
	}
	
	
	@RequestMapping("/add-bank-account")
	public String addBankAccount() {
		return "addBankAcc";
	}
	
	
	@RequestMapping("/statement-req")
	public String editBankAccount() {
		return "statementReq";
	}
	
}
