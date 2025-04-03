package com.pradeep.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pradeep.entity.BankAccEntity;
import com.pradeep.entity.TransactionsEntity;
import com.pradeep.entity.UserEntity;
import com.pradeep.service.BankAccService;
import com.pradeep.service.TransactionService;
import com.pradeep.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	BankAccService bankService;
	
	@Autowired
	TransactionService txnService;
	
	@RequestMapping("/user")
	public String user(Model model) {
		UserEntity user=userService.getUserById(1);
		model.addAttribute("user", user);
		List<BankAccEntity> userBankAccs=bankService.getBankAccByUserID(user);
		model.addAttribute("bankAccs", userBankAccs);
		List<TransactionsEntity> userTxns=txnService.getTxnsByUser(user.getUserId());
		model.addAttribute("userTxns", userTxns);
		return "dashboard";
	}
	
	
	
//	@RequestMapping("/userbankAccs")
//	public String numOfBankAccs(Model model) {
//		UserEntity user=userService.getUserById(1);
//		List<BankAccEntity> userBankAccs=bankService.getBankAccByUserID(user);
//		model.addAttribute("bankAccs", userBankAccs);
//		return "dashboard";
//	}
}
