package com.pradeep.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pradeep.entity.BankAccEntity;
import com.pradeep.entity.UserEntity;
import com.pradeep.repository.BankAccRepository;

@Service
public class BankAccService {
	
	@Autowired
	BankAccRepository bankAccDAO;
 	
	public List<BankAccEntity> getBankAccByUserID(UserEntity user) {
		List<BankAccEntity> bankAccs=bankAccDAO.findByUser(user);
		return bankAccs;
	}
}
