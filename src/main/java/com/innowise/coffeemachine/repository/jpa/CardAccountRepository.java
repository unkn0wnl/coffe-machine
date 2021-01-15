package com.innowise.coffeemachine.repository.jpa;

import com.innowise.coffeemachine.entity.CardAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardAccountRepository extends JpaRepository<CardAccount, Long> {
}
