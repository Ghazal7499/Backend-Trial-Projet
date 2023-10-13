package com.demoBackedStarter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demoBackedStarter.entity.Banking;

public interface BankingRepository extends JpaRepository<Banking, Long> {

}
