package com.pradeep.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pradeep.entity.BankAccEntity;
import com.pradeep.entity.TransactionsEntity;
import com.pradeep.entity.UserEntity;

@Repository
public interface TransactionsRepository extends JpaRepository<TransactionsEntity, Integer>{
	public List<TransactionsEntity> findBySourceId(int sourceId);
}

