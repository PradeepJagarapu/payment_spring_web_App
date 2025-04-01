package com.pradeep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pradeep.entity.UserAccEntity;

@Repository
public interface UserAccRepository extends JpaRepository<UserAccEntity, Integer>{

}

