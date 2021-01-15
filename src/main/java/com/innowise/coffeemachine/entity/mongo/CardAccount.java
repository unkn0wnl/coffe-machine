package com.innowise.coffeemachine.entity.mongo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(collection = "card_account")
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class CardAccount {

    @Id
    private String id;
    private String cardNumber;
    private BigDecimal amount;

}
