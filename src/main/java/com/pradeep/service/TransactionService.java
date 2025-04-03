package com.pradeep.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pradeep.entity.TransactionsEntity;
import com.pradeep.entity.UserEntity;
import com.pradeep.repository.TransactionsRepository;

@Service
public class TransactionService {
	
	@Autowired
	TransactionsRepository txnDAO;
	
	public List<TransactionsEntity> getTxnsByUser(int userId) {
		List<TransactionsEntity> userTxns=txnDAO.findBySourceId(userId);
		return userTxns;
	}
}
