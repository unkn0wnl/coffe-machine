package com.innowise.coffeemachine.repository.jpa;

import com.innowise.coffeemachine.entity.jpa.CardAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardAccountRepository extends JpaRepository<CardAccount, Long> {
}
