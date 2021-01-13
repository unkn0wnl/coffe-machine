package com.innowise.coffeemachine.repository;

import com.innowise.coffeemachine.entity.CardAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardAccountRepository extends JpaRepository<CardAccount, Long> {
}
