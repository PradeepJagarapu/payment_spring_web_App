package com.pradeep.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pradeep.entity.TransactionsEntity;
import com.pradeep.entity.UserEntity;
import com.pradeep.repository.BankAccRepository;
import com.pradeep.repository.TransactionsRepository;

@Service
public class TransactionService {
	
	@Autowired
	TransactionsRepository txnDAO;
	
	@Autowired
	BankAccRepository bankDAO;
	
	public List<TransactionsEntity> getTxnsByUser(int userId) {
		List<TransactionsEntity> userTxns=txnDAO.findBySourceId(userId);
		return userTxns;
	}
	
	public void recordTxn(int userId,String toType,double amount,String toAccount) {
		int targetId=bankDAO.findByAccountNumber(toAccount).get().getUser().getUserId();
		TransactionsEntity txn=new TransactionsEntity();
		txn.setDestinationType(toType);
		txn.setSourceType("BA");
		txn.setTransactionAmount(BigDecimal.valueOf(amount));
		txn.setSourceId(userId);
		txn.setTransactionDateTime(LocalDateTime.now());
		txn.setTargetId(targetId);
		
		txnDAO.save(txn);
		
	}
}
