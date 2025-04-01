package com.pradeep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pradeep.entity.BankAccEntity;

@Repository
public interface BankAccRepository extends JpaRepository<BankAccEntity, Integer>{

}
