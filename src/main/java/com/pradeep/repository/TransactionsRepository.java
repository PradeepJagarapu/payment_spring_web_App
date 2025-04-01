package com.pradeep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pradeep.entity.TransactionsEntity;

@Repository
public interface TransactionsRepository extends JpaRepository<TransactionsEntity, Integer>{

}

