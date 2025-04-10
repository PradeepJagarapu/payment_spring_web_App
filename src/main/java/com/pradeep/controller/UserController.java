package com.pradeep.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pradeep.dto.BankAccDTO;
import com.pradeep.dto.UserDTO;
import com.pradeep.entity.BankAccEntity;
import com.pradeep.entity.TransactionsEntity;
import com.pradeep.entity.UserEntity;
import com.pradeep.service.BankAccService;
import com.pradeep.service.TransactionService;
import com.pradeep.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	BankAccService bankService;
	
	@Autowired
	TransactionService txnService;
	
	@RequestMapping("/dashboard")
	public String user(Model model,HttpSession session) {
		int userId=(int) session.getAttribute("userId");
		UserEntity user=userService.getUserById(userId);
		model.addAttribute("user", user);
		List<BankAccEntity> userBankAccs=bankService.getBankAccByUserID(user);
		model.addAttribute("bankAccs", userBankAccs);
		List<TransactionsEntity> userTxns=txnService.getTxnsByUser(user.getUserId());
		model.addAttribute("userTxns", userTxns);
		return "dashboard";
	}
	
	@GetMapping("/edit-profile")
	public String editProfilePage(Model model,HttpSession session) {
		int userId=(int) session.getAttribute("userId");
		UserEntity user=userService.getUserById(userId);
		model.addAttribute("user", user);
		return "editProfile";
	}
	
	
	@PostMapping("/edit-profile")
	public String updateProfile(@ModelAttribute UserDTO userdto,Model model,HttpSession session) {
		int userId=(int) session.getAttribute("userId");
		userService.updateUser(userdto, userId);
		return "redirect:/dashboard";
	}
	
	@PostMapping("/add-bank-account")
	public String addBankAcc(@ModelAttribute BankAccDTO bankAccDTO,HttpSession session){
		int userId=(int) session.getAttribute("userId");
		UserEntity user=userService.getUserById(userId);
		BankAccEntity bankAcc=new BankAccEntity();
		bankAcc.setAccountNumber(bankAccDTO.getAccountNumber());
		bankAcc.setBalance(bankAccDTO.getBalance());
		bankAcc.setBankName(bankAccDTO.getBankName());
		bankAcc.setBranchLocation(bankAccDTO.getBranchLocation());
		bankAcc.setIfscCode(bankAccDTO.getIfscCode());
		bankAcc.setUser(user);
		bankAcc.setIsActive("yes");
		bankService.addBankAccount(bankAcc);
		return "redirect:/dashboard";
	}
	
	
//	@RequestMapping("/userbankAccs")
//	public String numOfBankAccs(Model model) {
//		UserEntity user=userService.getUserById(1);
//		List<BankAccEntity> userBankAccs=bankService.getBankAccByUserID(user);
//		model.addAttribute("bankAccs", userBankAccs);
//		return "dashboard";
//	}
}
